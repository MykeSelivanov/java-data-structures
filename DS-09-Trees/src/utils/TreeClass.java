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
            // check if less
            if(value < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = node;
                    break;
                } else {
                    current = current.leftChild;
                }
            } else {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    break;
                } else {
                    current = current.rightChild;
                }
            }
        }
    }
    // Preorder Root-Left-right
    private void traversePreOrder(Node root){

    }

    public boolean isEmpty(){
        return root == null;
    }

}
