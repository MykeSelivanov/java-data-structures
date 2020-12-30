package runner;

import bubblesort.MyBubbleSort;
import bubblesort.MyInsertionSort;
import bubblesort.MySelectionSort;

import java.util.Arrays;

public class SoringMainApp {
    public static void main(String[] args) {

        var myArray = new int[] {8,2,4,1,3};

        // Bubble sort
        var myBubbleSort = new MyBubbleSort();
        System.out.println(Arrays.toString(myBubbleSort.bubbleSort(myArray)));

        // Selection sort
        var mySelectionSort = new MySelectionSort();
        System.out.println(Arrays.toString(mySelectionSort.selectionSort(myArray)));

        // Insertion sort
        var myInsertionSort = new MyInsertionSort();
        System.out.println(Arrays.toString(myInsertionSort.insertionSort(myArray)));



    }

}
