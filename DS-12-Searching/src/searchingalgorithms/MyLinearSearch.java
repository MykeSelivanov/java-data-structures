package searchingalgorithms;

public class MyLinearSearch {

    public int linearSearch(int[] array, int data){
        for (int i = 0; i < array.length; i++)
            if (array[i] == data)
                return i;
        return -1;
    }

}
