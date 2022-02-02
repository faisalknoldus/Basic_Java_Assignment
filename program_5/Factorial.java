
package program_5;

import java.util.*;
public class Factorial {

   public static int FirstFactorial(int num)
   {
        if (num < 2)
        {
            return 1;
        }
        return num * FirstFactorial(num-1);
    }

    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);

       System.out.print("Enter a number to calculate factorial: ");
        int n= sc.nextInt();
       int fact= FirstFactorial(n);
       System.out.printf("Factorial of %d is: %d",n,fact);
    }
}
