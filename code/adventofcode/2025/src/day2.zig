const std = @import("std");

pub fn main() !void {
    const dayOnePartOneRes = try dayTwoPartOne("input/day2.txt");
    std.debug.print("Day 2 Part 1 Result: {}\n", .{dayOnePartOneRes});
}

fn dayTwoPartOne(input: []const u8) !u64 {
    const file = try std.fs.cwd().openFile(input, .{});
    defer file.close();

    var gpa = std.heap.DebugAllocator(.{}){};
    defer _ = gpa.deinit();
    const alloc = gpa.allocator();
    var buffer: [4096]u8 = undefined;
    var reader_wrapper = file.reader(&buffer);
    const reader = &reader_wrapper.interface;

    var line = std.Io.Writer.Allocating.init(alloc);
    defer line.deinit();

    var invalid_id_sum: u64 = 0;
    while (true) {
        _ = reader.streamDelimiter(&line.writer, ',') catch |err| {
            if (err == error.EndOfStream) break else return err;
        };
        _ = reader.toss(1); // skip the delimiter byte.
        const read = line.written();

        const dash_index = std.mem.indexOf(u8, read, "-") orelse
            return error.InvalidInput;
        const first_id = try parseU64(read[0..dash_index]);
        const second_id = try parseU64(read[dash_index + 1 .. read.len]);

        const current_invalid_id_sum = find_invalid_id_sum(first_id, second_id);
        invalid_id_sum += current_invalid_id_sum;

        line.clearRetainingCapacity(); // reset the accumulating buffer.
    }
    return invalid_id_sum;
}

fn find_invalid_id_sum(first_id: u64, second_id: u64) u64 {
    std.debug.print("Finding invalid IDs between {} and {}\n", .{ first_id, second_id });
    var invalid_ids_sum: u64 = 0;
    var index: u64 = first_id;
    while (index <= second_id) : (index += 1) {
        if (has_repeating_sequnces(index)) {
            invalid_ids_sum += index;
        }
    }
    return invalid_ids_sum;
}

// check if a number has any repeating sequences
// e.g. 123123 -> true (123 and 123 twice!)
// e.g. 32123 -> false (no repeating sequences, also odd length so can't have)
// e.g. 123456 -> false
fn has_repeating_sequnces(num: u64) bool {
    const num_str = std.fmt.allocPrint(std.heap.page_allocator, "{}", .{num}) catch return false;
    defer std.heap.page_allocator.free(num_str);

    const len = num_str.len;
    if (len % 2 != 0) {
        return false; // odd length numbers cannot have repeating sequences
    }
    const first_half = num_str[0 .. len / 2];
    const second_half = num_str[len / 2 .. len];
    return std.mem.eql(u8, first_half, second_half);
}

// parse u64 from string
fn parseU64(num_str: []const u8) !u64 {
    return try std.fmt.parseInt(u64, num_str, 10);
}

test "day two part one" {
    const result = try dayTwoPartOne("input/day2-test.txt");
    try std.testing.expectEqual(1227775554, result);
}
