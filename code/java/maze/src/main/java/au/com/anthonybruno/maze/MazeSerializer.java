package au.com.anthonybruno.maze;

import au.com.anthonybruno.maze.square.EmptySquare;
import au.com.anthonybruno.maze.square.Square;
import au.com.anthonybruno.maze.square.Wall;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public class MazeSerializer {

    private static final char WALL = '#';
    private static final char EMPTY_SQUARE = ' ';

    private static Map<Character, Supplier<Square>> converter = new HashMap<>();
    static
    {
        converter.put(WALL, () -> new Wall());
        converter.put(EMPTY_SQUARE, () -> new EmptySquare());
    }

    public static Maze loadFromFile(File file) throws IOException {
        List<List<Square>> squares = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            reader.lines().forEach((line) -> {
                List<Square> row = new ArrayList<>();
                for (int i = 0; i < line.length(); i++) {
                    row.add(converter.get(line.charAt(i)).get());
                }
            });
        }
        return new Maze(squares);
    }
}
