/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgorithmPractice;

/**
 *
 * @author johnzubiri
 */



// A basic priority queue implementation using an array and two methods enqueue/dequeue to mimic operations.

public class MyPriorityQueue {
    private int size;
    private int[] elementsArray;
    private int numItems;
    
    MyPriorityQueue() {
        this.size = 10;
        this.numItems = 0;
        this.elementsArray = new int[size];
    }

    // Instead of writing the enqueue method ourselves, I think we can replicate a PriorityQueue's behavior by 
    // just have an array of values and sorting them using Arrays.sort(array, Collections.reverseOrder());
    public void enqueue(int value) {
        int place = 0;
        
        if (numItems == 0)
            // Had a bug here! I was using place++ when I need numItems++
            elementsArray[numItems++] = value;
        else {

            for (place = numItems-1; place >= 0; place--) {
                
                if (value > elementsArray[place]) {
                    elementsArray[place+1] = elementsArray[place];
                } else
                    break;
            }
            
            elementsArray[place+1] = value;
            numItems++;
        }
        
        
    }
    
    
    // Note, we're not really deleting anything.. we just have limited access to this queue so when we dequeue we always
    // return the smallest/end element of our array
    public int dequeue() {
        return elementsArray[--numItems];
        
    }
    
    
    
    
    
    
    public static void main (String[] args) {
        
        MyPriorityQueue queue = new MyPriorityQueue();
        
        
        queue.enqueue(1);
        queue.enqueue(10);
        queue.enqueue(7);
        queue.enqueue(4);
        
        
        for (int i = 0; i < queue.size; i++) {
            System.out.println(queue.elementsArray[i]);
        }
        
        System.out.println("Number of items: " + queue.numItems);

        
        
        
    }
    
}
