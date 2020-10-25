package dev.anthonybruno.concurrency.chat.util;

import java.io.Closeable;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.function.Supplier;

public class IoUtils {

    public static void closeUnchecked(AutoCloseable closeable) {
        try {
            closeable.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> T doUnchecked(ThrowingSupplier<T> supplier) {
        return new UncheckedSupplier<>(supplier).get();
    }

    public static class UncheckedSupplier<T> implements Supplier<T> {

        private final ThrowingSupplier<T> throwingSupplier;

        public UncheckedSupplier(ThrowingSupplier<T> throwingSupplier) {
            this.throwingSupplier = throwingSupplier;
        }

        @Override
        public T get() {
            try {
                return throwingSupplier.get();
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }
    }

    @FunctionalInterface
    public interface ThrowingSupplier<T> {

        T get() throws IOException;

    }
}
