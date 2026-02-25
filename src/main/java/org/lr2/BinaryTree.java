package org.lr2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class BinaryTree {
    private Node root;
    private Deque<Node> stack = new ArrayDeque<>();
    private Queue<Node> queue = new ArrayDeque<>();

    public void add(int value){
        Node newNode = new Node(value);
        if (root == null){
            root = newNode;
            return;
        }
        Node current = root;
        Node parent = null;
        while (current != null){
            parent = current;
            if (value < current.getValue()) current = current.getLeft();
            else current = current.getRight();
        }
        if (value < parent.getValue()) parent.setLeft(newNode);
        else parent.setRight(newNode);
        newNode.setParent(parent);
    }
    public int countRecursivelyDFS(){
        return recCount(root);
    }
    private int recCount(Node node){
        if (node == null) return 0;
        return 1 + recCount(node.getLeft()) + recCount(node.getRight());
    }
    public int countIterativeDFS(){
        int count = 0;
        stack.push(root);
        while (!stack.isEmpty()){
            Node current = stack.pop();
            count++;
            if (current.getRight() != null) stack.push(current.getRight());
            if (current.getLeft()!= null) stack.push(current.getLeft());
        }
        return count;
    }
    public int countIterativeBFS(){
        int count = 0;
        queue.add(root);
        while (!queue.isEmpty()){
            Node current = queue.poll();
            count ++;
            if (current.getLeft() != null) queue.add(current.getLeft());
            if (current.getRight()!= null) queue.add(current.getRight());
        }
        return count;
    }

}
