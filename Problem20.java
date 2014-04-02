/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problem20;
import java.math.BigInteger;
/**
 *
 * @author Anshuman
 */
public class Problem20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  BigInteger n = BigInteger.valueOf(100);
        int Sum = 0;
        BigInteger result = (factorial(n));
        String string_result = String.valueOf(result);
         
        for(int i = 0; i <= string_result.length() - 1; i ++){
            Character c = new Character(string_result.charAt(i));
            String s = c.toString();
            int n1 = Integer.parseInt(s);
            Sum += n1;
        }
        System.out.format("Sum = %d%n", Sum);
    }
    public static BigInteger factorial( BigInteger n )
    {
            if ( n.compareTo(BigInteger.ZERO) <= 0 ) { // base case
                return BigInteger.ONE;
            }
            else  {  // general case
                return ( n.multiply(factorial ( n.subtract(BigInteger.ONE)) ) );
            }
    }
}
