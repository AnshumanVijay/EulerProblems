/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problem_12;

/**
 *
 * @author Anshuman
 */
public class Problem_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int counter = 0;
 int trianglenumber = 0;
boolean Switch = true; 
while(Switch == true)
{
counter++;
        trianglenumber +=counter;
        if(factors(trianglenumber)>500)
{
System.out.println(trianglenumber);
        Switch = false;        
}
}// TODO code application logic here
    }
    
public static int factors(int n)
{
int counter = 0;
int a = (int) Math.sqrt(n);
for(int i =1;i< a+1; i++)
{
if(n%i == 0)
{
counter++;
}
}
return 2 * counter;
}
}



