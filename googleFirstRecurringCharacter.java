/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author John
 */
public class googleFirstRecurringCharacter {
    
    public static Character firstRecurringCharacter(String input) {
        Map<Character,Integer> seenMap = new HashMap<>();
        int count = 1;
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (seenMap.containsKey(c)) {
                return c;
            } else
                seenMap.put(c, count);
            
        }
        return null;
    }
    
    
    
    
    public static void main(String[] args) {
        
        String string = "DBCABA";
        
        System.out.println(firstRecurringCharacter(string));
        
    }
    
}
