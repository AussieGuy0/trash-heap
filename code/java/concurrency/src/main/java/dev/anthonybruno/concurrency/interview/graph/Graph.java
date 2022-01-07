package dev.anthonybruno.concurrency.interview.graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class Graph<T> {

    private final Node<T> head;

    public Graph(Node<T> head) {
        this.head = head;
    }

    public Node<T> head() {
        return head;
    }

    public void depthFirstSearch(NodeVisitor<T> nodeVisitor)  {
        depthFirstSearch(head, nodeVisitor, new HashSet<>());
    }

    private void depthFirstSearch(Node<T> node, NodeVisitor<T> nodeVisitor, Set<Node<T>> visited) {
        nodeVisitor.visit(node);
        visited.add(node);
        for (Node<T> adjNode : node.adjacentNodes()) {
            if (!visited.contains(adjNode))  {
                depthFirstSearch(node, nodeVisitor, visited);
            }
        }
    }

    private void breadthFirstSearch(NodeVisitor<T> nodeVisitor) {
//        Map.of("a", 1).merge("a", 1, )
    }

    private void breadthFirstSearch(Node<T> node, NodeVisitor<T> nodeVisitor, Set<Node<T>> visited, LinkedList<T> stack) {
    }
}
