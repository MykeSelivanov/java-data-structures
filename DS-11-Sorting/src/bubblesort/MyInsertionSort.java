package bubblesort;

public class MyInsertionSort {
    public int[] insertionSort(int[] array){
        for(int i = 1; i < array.length; i++){
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > current){
                // shifting operation
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
        return array;
    }

}
