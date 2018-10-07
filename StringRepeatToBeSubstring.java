/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author John
 */
public class StringRepeatToBeSubstring {
    
    //https://www.geeksforgeeks.org/google-interview-experience-set-7-software-engineering-intern/
    
    public static void main(String[] args) {
        
        System.out.println(stringCheck("abcd", "cdabcdab"));
        

        
    }
    
     // How many times must string A be repeated to contain a substring of B?
    public static int stringCheck(String a, String b) { //ab[cdabcdab]cd - 3 times
        
        boolean isEqual = false;
        int numTimes = 0;
        
        while (!isEqual && numTimes < 1000) {

            if (a.equals(b)) {
                isEqual = true;
                numTimes = 1;
                
            } else if (a.contains(b)) {
                isEqual = true;

            } else if (!a.contains(b)) {
                a += a;
                numTimes++;
                stringCheck(a,b);
            }
        
        }
        
        
        
        return numTimes;
    }
    
    
    
}
