package dev.anthonybruno.concurrency.interview.graph;

public interface NodeVisitor<T> {

    void visit(Node<T> node);
}
