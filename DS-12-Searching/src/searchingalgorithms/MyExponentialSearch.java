package searchingalgorithms;

public class MyExponentialSearch {
    public int exponentialSearch(int[] array, int data){
        int bound = 1;

        while (bound < array.length && array[bound] < data) {
            bound *= 2;
        }
        int left = bound / 2;
        int right = Math.min(bound, array.length - 1);

        var myBinarySearch = new MyBinarySearchRecursive();
        return myBinarySearch.binarySearchRecursive(array, data, left, right);

    }

}
