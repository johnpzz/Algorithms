/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

/**
 *
 * @author John
 */
public class listOfSquares {
    
    
    public static int getLargestSquare(int num) {
        
        int largestSquare = 1;
        
        while (largestSquare <= num) {
        
            if (largestSquare*largestSquare <= num) {
                largestSquare++;
            } else 
                break;
        }
        
        // At this point, largestSquare*largestSquare was <= num, so we incremented it.
        // Now, largestSquare*largestSquare is greater than num, so we exit the loop.
        // We found our largestSquare number, it's one less than its current number here
        // So.. we return (largestSquare-1)*(largestSquare-1)
        return (largestSquare-1)*(largestSquare-1);
    
    }
    
    public static int[] getSquares(int area) {
        int[] listOfSquares = new int[10];
        
        int index = 0;
        
        while (area > 0) {
            int square = getLargestSquare(area);
            listOfSquares[index] = square;
            area -= square;
            index++;
        }
        
        // At this point, we have an array called listOfSquares that contains our squares from largest to smallest.
        // However, it is of arbitrary size 10 and may be filled with trailing 0's.
        // We should now find what index has a 0, and make a new array that contains only the elements with squares in them.
        
        int numOfSquares = 0;
        for (int i = 0; i < listOfSquares.length; i++) {
            // If we find a zero, we know to stop since our listOfSquares starts with greatest to smallest square.
            if (listOfSquares[i] == 0) {
                break;
            }
            numOfSquares++;
        }
       
        // New list of size of numOfSquares
        int[] newListOfSquares = new int[numOfSquares];
        
        for (int i = 0; i < newListOfSquares.length; i++) {
            newListOfSquares[i] = listOfSquares[i];
        }
        
        return newListOfSquares;
    }
    
    
    
    public static void main (String[] args) {
        
        //System.out.println(getLargestSquare(12));
        
        int[] array = getSquares(80);
        
        for (int i : array) {
            System.out.println(i);
        }
        
        
    }
    
}
