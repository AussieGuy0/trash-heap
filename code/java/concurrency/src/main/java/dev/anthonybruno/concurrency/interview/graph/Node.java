package dev.anthonybruno.concurrency.interview.graph;

import java.util.List;

public class Node<T> {

    private List<Node<T>> adjacentNodes;

    public Node(List<Node<T>> adjacentNodes) {
        this.adjacentNodes = adjacentNodes;
    }

    public List<Node<T>> adjacentNodes() {
        return adjacentNodes;
    }
}
