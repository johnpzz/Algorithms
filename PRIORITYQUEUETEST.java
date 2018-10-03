/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgorithmPractice;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 *
 * @author johnzubiri
 */
public class PRIORITYQUEUETEST {
    
    
    // * To iterate in order of the priority queue, poll the queue don't print it *
    // * This is because priority queue's are implemented as heaps *
    // ****************************************************************************
    
    
    
    public static void main (String[] args) {
        
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(7);
        queue.add(4);
        queue.add(5);
        queue.add(1);
        queue.add(3);
        
        System.out.println("Printing:");
        for (Integer i : queue) {
            System.out.println(i);
        }
        
        System.out.println("Polling:");
        int bob = queue.size();
        for (int i = bob-1; i>=0; i--) {
            System.out.println(queue.poll());
        }
        
        System.out.printf("\nStrings example\n\n");
        
        PriorityQueue<String> queue2 = new PriorityQueue<>();
        queue2.add("C++");
        queue2.add("C");
        queue2.add("Apples");
        queue2.add("Z");
        queue2.add("Python");
        queue2.add("Java");
        //Note, sometimes queue doesn't traverse correctly when iterating because it's implemented as a priority heap.
        //Convert to array, then sort array
        
        //This won't print them out in order since it is a heap.
        System.out.println("Printing:");
        for (String s : queue2) {
            System.out.println(s);
        }
        
        
        int a = queue2.size();
        //Polling or removing them will print them out in priority/order
        System.out.println("\nPolling:");
        for (int i = a-1; i >=0; i--) {
            
            String s = queue2.poll();
            System.out.println(s);
        }


        
        
        
        System.out.println("\n\n\n\n");
        
        for (String s : queue2) {
            System.out.println(s);
        }
        
        Arrays.sort(queue2.toArray());
       
        //Note, sometimes queue doesn't automatically order elements, only does it when it reaches a certain size (?)
        
    }
    
}
