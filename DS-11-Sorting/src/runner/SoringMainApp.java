package runner;

import bubblesort.MyBubbleSort;

import java.util.Arrays;

public class SoringMainApp {
    public static void main(String[] args) {

        var myArray = new int[] {8,2,4,1,3};

        // Bubble sort
        var myBubbleSort = new MyBubbleSort();
        System.out.println(Arrays.toString(myBubbleSort.bubbleSort(myArray)));

    }

}
