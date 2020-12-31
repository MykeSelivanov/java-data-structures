package searchingalgorithms;

public class MyBinarySearchRecursive {

    public int binarySearchRecursive(int[] array, int data){

        return binarySearchRecursive(array, data, 0, array.length - 1);
        }

        public int binarySearchRecursive(int[] array,int data, int left, int right){
        if (right < left) return -1;

        int middle = (left + right) / 2;
        if (array[middle] == data) return middle;

        if (data < array[middle]) return binarySearchRecursive(array, data, left, middle-1);

        return binarySearchRecursive(array, data, middle+1, right);

    }

}
