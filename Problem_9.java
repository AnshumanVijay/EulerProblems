/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problem_9;

/**
 *
 * @author Anshuman
 */
public class Problem_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int n = 1; n < 500; n++)
        {
        for(int m = (n + 1); m < 500; m++)
        {
        int a = m*m - n*n;
        int b = 2*m*n;
        int c = m*m + n*n;
        if(a + b +c == 1000)
        {
        int product = a*b*c;
        System.out.format("Product = %d " + newline, product);
        }
        
        }
        }// TODO code application logic here
    }
    public static String newline = System.getProperty("line.separator");
}
