/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problem_15;
import java.math.BigInteger;
/**
 *
 * @author Anshuman
 */
public class Problem_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int n = 40;
        int r = 20;
       System.out.println(factorial(n).divide(factorial(r)).multiply(factorial(n-r)));
// TODO code application logic here
    }
    public static BigInteger factorial(int a)
    {
    BigInteger n = BigInteger.ONE;
    for(int i =1; i <= a; i++)
    {
    n = n.multiply(BigInteger.valueOf(i));
    }
    return n;
    }
    
}
