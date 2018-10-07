/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author John
 */
public class SubList {
        // Takes a list L and returns a random sublist of size N of that list. 
    // Assume that the indexes must be in increasing order. That is, you cannot go backwards.
    
    // I think this is supposed to be implemented as an array, though.
    public static List<Integer> randomSubList(List<Integer> list, int size) {
        List<Integer> subList = new ArrayList<Integer>(size);
        Collections.sort(list);
        
        int random = new Random().nextInt(size);
        subList.add(list.get(random));
        
        List<Integer> remainingPoolList = list.subList(random+1, list.size());

        
        while (!remainingPoolList.isEmpty() && subList.size() < size) {
            
                Collections.shuffle(remainingPoolList);
                subList.add(remainingPoolList.get(0));
                remainingPoolList.remove(0);
            
        }
        
        Collections.sort(subList);
        

        

        
        
        
        return subList;
    }
    
    
    
    
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(5);
        int n = 3;
        List<Integer> subList = randomSubList(list, n);
        System.out.println("Elements:");
        for (int i : subList) {
            System.out.println(i);
        }
    }
    
}
