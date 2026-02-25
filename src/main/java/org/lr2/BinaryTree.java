package org.lr2;

public class BinaryTree {
    private Node root;

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
    public int count(){
        return recCount(root);
    }
    private int recCount(Node node){
        if (node == null) return 0;
        return 1 + recCount(node.getLeft()) + recCount(node.getRight());
    }
}
