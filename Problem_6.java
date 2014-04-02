/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problem_6;

/**
 *
 * @author Anshuman
 */
public class Problem_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int sum_of_squares = 0;
       int square_of_sum = 0;
int sum =0;
for (int  i =0; i < 101; i++)
{
    int square = (int)Math.pow(i,2);
    sum_of_squares += square;
    sum += i;
 }
square_of_sum = (int)Math.pow(sum,2);

int Difference = sum_of_squares - square_of_sum;
System.out.println("Difference is = " + Difference);
   
    
    }
}
