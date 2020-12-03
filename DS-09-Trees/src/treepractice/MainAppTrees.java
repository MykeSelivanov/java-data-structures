package treepractice;

import utils.CustomTree;

public class MainAppTrees {
    public static void main(String[] args) {


        CustomTree myTree = new CustomTree();
        int[] numArray = new int[]{10, 6, 8, 20, 4, 9, 5, 17, 42, 47, 29};
        for (int i = 0; i < 11; i++) {
            myTree.insert(numArray[i]);
        }
        System.out.println("PreOrder Traversal Tree");
        myTree.traversePreOrder();

    }

}
