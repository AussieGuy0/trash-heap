package dev.anthonybruno.concurrency.interview.structure;

import org.jetbrains.annotations.Nullable;

public class CoolStack<T> {

    @Nullable
    private StackNode<T> top;
    private int size = 0;

    @Nullable
    public T pop() {
        if (top == null) {
            return null;
        }
        size--;
        T toReturn = top.data;
        top = top.next;
        return toReturn;
    }

    public void push(T data) {
        size++;
        StackNode<T> newNode = new StackNode<>(data);
        newNode.next = top;
        top = newNode;
    }

    @Nullable
    public T peek() {
        return top != null ? top.data : null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    private static class StackNode<T> {

        private T data;
        private StackNode<T> next;

        public StackNode(T data) {
            this.data = data;
        }
    }
}
