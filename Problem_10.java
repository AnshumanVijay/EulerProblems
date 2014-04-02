/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problem_10;

/**
 *
 * @author Anshuman
 */
public class Problem_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Problem_10 prob_10Obj = new Problem_10();
         
        // answer will be a long
        long Sum = 0;
         
        // start the counter at 1 and increase by 2 (all odd numbers)
        int counter = 1;
         
        // while counter is less than two million
        while (counter < 2000000) {
             
            // checks to see if counter is a prime number - if true - add to Sum
            if (prob_10Obj.isPrime(counter)) {
                Sum += counter;
            }
            // increase counter by 2 -> 1, 3, 5, 7, 9, 11, etc.
            counter += 2;
        }
        // add 2 to the Sum - our counter does not count the first prime number -> 2.
        System.out.println(Sum + 2); 
    }
 
    public boolean isPrime(int n)
        {
        if (n == 1){
            return false;
        }
        int k = (int) Math.sqrt(n);
            for (int i = 2; i <= k; i++)
            {
                if (n % i == 0)
                    return false;
            }
            return true;
        }
 
}
