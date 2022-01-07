package dev.anthonybruno.concurrency.interview.structure;

import org.jetbrains.annotations.Nullable;

public class SetOfStacks<T> {

    private final static int MAX_STACK_SIZE = 3;
    private final CoolStack<CoolStack<T>> baseStack = new CoolStack<>();

    public void push(T element) {
        CoolStack<T> stack = baseStack.peek();
        if (stack == null) {
            stack = new CoolStack<>();
            baseStack.push(stack);
        } else if (stack.size() >= MAX_STACK_SIZE) {
            stack = new CoolStack<>();
            baseStack.push(stack);
        }
        stack.push(element);
    }

    @Nullable
    public T pop() {
        return popInternal();
    }


    @Nullable
    private T popInternal() {
        CoolStack<T> stack = baseStack.peek();
        if (stack == null) {
            return null;
        } else if (stack.isEmpty()) {
            baseStack.pop();
            return popInternal();
        }
        return stack.pop();
    }

}
