package utils;

public class TreeClass {
    // Nested Node class
    private class Node{
        private Node leftChild;
        private Node rightChild;
        private int value;

        public Node(int value){
            this.value = value;
        }
    }

    private Node root;
    // insert method for BST
    public void insert(int value){
        Node node = new Node(value);
        // if tree is empty
        if(isEmpty()) {
            root = node;
            return;
        }
        // if tree is not empty
        Node current = root;
        while (true) {

        }
    }

    public boolean isEmpty(){
        return root == null;
    }

}
