package runner;

import bubblesort.MyBubbleSort;
import bubblesort.MyInsertionSort;
import bubblesort.MyMergeSort;
import bubblesort.MySelectionSort;

import java.util.Arrays;

public class SoringMainApp {
    public static void main(String[] args) {

        var myArray = new int[] {8,2,4,1,3,-1,0};

        // Bubble sort
        myArray = new int[]{8,2,4,1,3,-1,0};
        System.out.println("Bubble sort for: " + Arrays.toString(myArray));
        var myBubbleSort = new MyBubbleSort();
        System.out.println(Arrays.toString(myBubbleSort.bubbleSort(myArray)));

        // Selection sort
        myArray = new int[]{8,2,4,1,3,-1,0};
        System.out.println("Selection sort for: " + Arrays.toString(myArray));
        var mySelectionSort = new MySelectionSort();
        System.out.println(Arrays.toString(mySelectionSort.selectionSort(myArray)));

        // Insertion sort
        myArray = new int[]{8,2,4,1,3,-1,0};
        System.out.println("Insertion sort for: " + Arrays.toString(myArray));
        var myInsertionSort = new MyInsertionSort();
        System.out.println(Arrays.toString(myInsertionSort.insertionSort(myArray)));

        // Merge sort
        myArray = new int[]{8,2,4,1,3,-1,0};
        System.out.println("Merge sort for: " + Arrays.toString(myArray));
        var myMergeSort = new MyMergeSort();
        myMergeSort.mergeSort(myArray);
        System.out.println(Arrays.toString(myArray));


    }

}
