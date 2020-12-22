package dequeinterfacemethods;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeInterfaceMethods {
    public static void main(String[] args) {

        /**
         * Deque methods
         *
         *           Head        |        Tail
         *
         * Insert:  addFirst(e)  |   addLast(e)
         *          offerFirst(e)|   offerLast(e)
         *          push(e)      |
         * Remove:  removeFirst()|   removeLast()
         *          pollFirst    |   pollLast()
         *          pop()        |
         * Examine: getFirst()   |   getLast()
         *          peekFirst()  |   peekLast()
         */

        Deque<Integer> dQue = new ArrayDeque<>();

        dQue.push(1);
        dQue.push(3);
        dQue.push(4);
        dQue.push(6);
        dQue.push(8);
        dQue.push(20);
        System.out.println(dQue);

        System.out.println(dQue.pop());
        System.out.println(dQue);

        while (!dQue.isEmpty()) {
            System.out.println("Remove - " + dQue.pop());
        }
        System.out.println(dQue);


    }

}
