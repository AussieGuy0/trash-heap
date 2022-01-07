package dev.anthonybruno.concurrency.interview.structure;

import org.jetbrains.annotations.Nullable;

public class CoolQueue<T> {

    @Nullable
    private QueueNode<T> back;

    @Nullable
    private QueueNode<T> front;

    @Nullable
    public T pop() {
        if (front == null) {
            return null;
        }
        T toReturn = front.data;
        front = front.next;
        if (front == null) {
            back = null;
        }
        return toReturn;
    }

    public void push(T data) {
        QueueNode<T> newNode = new QueueNode<>(data);
        if (back != null) {
            back.next = newNode;
        }
        back = newNode;
        if (front == null) {
            front = back;
        }
    }

    @Nullable
    public T peek() {
        return back != null ? back.data : null;
    }

    public boolean isEmpty() {
        return back == null;
    }

    private static class QueueNode<T> {

        private T data;
        private QueueNode<T> next;

        public QueueNode(T data) {
            this.data = data;
        }
    }
}
