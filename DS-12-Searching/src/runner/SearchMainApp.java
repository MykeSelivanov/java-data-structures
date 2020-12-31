package runner;

import searchingalgorithms.*;

public class SearchMainApp {
    public static void main(String[] args) {

        int[] myArray = new int[]{1,2,3,4,5,6,89,100,109,111,112};

        // Linear Search
        var myLinearSearch = new MyLinearSearch();
        System.out.println("Linear Search : " + myLinearSearch.linearSearch(myArray,112));

        // List should be always sorted before applying Binary search!!! typically quick sort is used before searching
        // Binary search recursive
        var myBinarySearchRecursive = new MyBinarySearchRecursive();
        System.out.println("Binary search recursive: " + myBinarySearchRecursive.binarySearchRecursive(myArray, 3));

        // Binary search iterative
        var myBinarySearchIterative = new MyBinarySearchIterative();
        System.out.println("Binary search iterative: " + myBinarySearchIterative.binarySearchIterative(myArray, 89));

        // Ternary search
        var myTernarySearch = new MyTernarySearch();
        System.out.println("Ternary search: " + myTernarySearch.ternarySearch(myArray, 5));

        // Jump search
        var myJumpSearch = new MyJumpSearch();
        System.out.println("Jump search: " + myJumpSearch.jumpSearch(myArray, 111));

        // Exponential search
        var myExponentialSearch = new MyExponentialSearch();
        System.out.println("Exponential search: " + myExponentialSearch.exponentialSearch(myArray, 4));

    }

}
