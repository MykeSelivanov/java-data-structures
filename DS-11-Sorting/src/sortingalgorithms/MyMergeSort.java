package sortingalgorithms;

public class MyMergeSort {
    public void mergeSort(int [] array){
        if(array.length < 2) return; // termination criteria

        int middle = array.length / 2; // calculating middle value

        int[] leftSubArray = new int[middle]; // new subArray for the left part
        for( int i = 0; i < middle; i++){ // assign values from start to middle of original array to the left part subArray
            leftSubArray[i] = array[i];
        }

        int[] rightSubArray = new int[array.length - middle]; // new subArray for the right part
        for(int i = middle; i < array.length; i++){ // assign values from middle to end of original array to the right part subArray
            rightSubArray[i - middle] = array[i];
        }

        mergeSort(leftSubArray); // call mergeSort recursively for the left subArray
        mergeSort(rightSubArray); // call mergeSort recursively for the right subArray
        merge(leftSubArray, rightSubArray, array); // merge solutions into result array
    }

    private void merge(int[] leftSubArray, int[] rightSubArray, int[] resultArray){
        int i = 0, j = 0, k = 0;
        while (i < leftSubArray.length && j < rightSubArray.length){
            if (leftSubArray[i] <= rightSubArray[j]){
                resultArray[k] = leftSubArray[i];
                k++;
                i++;
            } else {
                resultArray[k] = rightSubArray[j];
                k++;
                j++;
            }
        }
        while (i < leftSubArray.length){
            resultArray[k] = leftSubArray[i];
            k++;
            i++;
        }
        while (j < rightSubArray.length){
            resultArray[k] = rightSubArray[j];
            k++;
            j++;
        }

    }

}
