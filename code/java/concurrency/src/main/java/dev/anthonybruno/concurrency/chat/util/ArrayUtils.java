package dev.anthonybruno.concurrency.chat.util;

import java.util.Arrays;

public class ArrayUtils {

    public static <T> boolean contains(T[] arr, T obj) {
        return Arrays.asList(arr).contains(obj);
    }
}
