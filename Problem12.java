/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problem12;

/**
 *
 * @author Anshuman
 */
public class Problem12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int counter = 0;
        int TriangleNumber = 0;
        boolean Switch = true;
        while(Switch == true){
            counter ++;
            TriangleNumber += counter;
            if(Factors(TriangleNumber) > 500){
                System.out.println(TriangleNumber);
                Switch = false;
            }
        }
         
    }
    public static int Factors(int n){
        // Finds all the factors of a number (n)
        // and returns the number of factors.
        int counter = 0;
        int k = (int) Math.sqrt(n);
        for(int i = 1; i < k + 1; i ++){
            if(n % i == 0){
                counter ++;
            }
        }
        return 2 * counter;// TODO code application logic here
    }
    
}
