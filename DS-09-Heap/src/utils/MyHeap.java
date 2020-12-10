package utils;

public class MyHeap {

    private final int [] heap = new int[20];
    private int size;

    private int parent(int index){
        return (index - 1) / 2;
    }

    public boolean isFull(){
        return size == heap.length;
    }


}
