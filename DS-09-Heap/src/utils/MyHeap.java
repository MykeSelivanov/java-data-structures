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

    public void insert(int value){
        if(isFull()) {
            throw new IllegalStateException();
        }
        heap[size++] = value;
        bubleUp();
    }

    public void bubleUp(){
        int index = size - 1;
        while ( index > 0 && heap[index] > heap[parent(index)]){
            swap(index, parent(index));
            index = parent(index);

        }
    }

    private void swap(int first, int second)

}
