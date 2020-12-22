package queueinterfacemethods;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueInterfaceMethods {
    public static void main(String[] args) {

        /**
         * Queue methods
         *
         * Queue can be implemented with LinkedList or ArrayDeque
         *
         *          Throws exception     |   Returns Special value
         * Insert:  add(e)               |  offer(e)
         * Remove:  remove()             | poll()
         * Examine: element()            | peek()
         */

        Queue<Integer> numQue = new LinkedList<>();
        numQue.offer(1);
        numQue.offer(3);
        numQue.offer(4);
        numQue.offer(6);
        numQue.offer(8);
        numQue.addAll(Arrays.asList(4,9,66));

        System.out.println(numQue);
        System.out.println(numQue.remove());
        System.out.println(numQue.poll()); // safer way to remove, avoiding risk to run into exception



    }


}
