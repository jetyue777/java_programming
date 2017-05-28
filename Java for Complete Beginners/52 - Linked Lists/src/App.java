import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
 
 
public class App {
 
 
    public static void main(String[] args) {
        /*
         * ArrayLists manage arrays internally.
         * [0][1][2][3][4][5] ....
         */
        List<Integer> arrayList = new ArrayList<Integer>();
         
        /*
         * LinkedLists consists of elements where each element
         * has a reference to the previous and next element
         * traverse/index through a linkedList is slower than arrayList
         * [0]->[1]->[2] ....
         *    <-   <-
         */
        List<Integer> linkedList = new LinkedList<Integer>();
         
        doTimings("ArrayList", arrayList);
        doTimings("LinkedList" , linkedList);
    }
     
    private static void doTimings(String type, List<Integer> list) {
         
        for(int i=0; i<1E5; i++) {
            list.add(i);
        }
         
        long start = System.currentTimeMillis();
         

       /* //Add items at end of list
        for(int i=0; i<1E5; i++) {
            list.add(i);
        }  //short for ArrayList, slower for LinkedList*/

         
        // Add items elsewhere in list
        for(int i=0; i<1E5; i++) {
            list.add(0, i);
        }
        //Time taken: 3135 ms for ArrayList
        //Time taken: 6 ms for LinkedList
         
        long end = System.currentTimeMillis();
         
        System.out.println("Time taken: " + (end - start) + " ms for " + type);
    }
     
 
 
}