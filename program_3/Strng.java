
/* 3. Program to remove a specified character from a given string... */
package program_3;
import java.util.*;
public class Strng {

    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a String: ");
      String str= sc.nextLine();


        System.out.print("Enter a character to remove from String:");
        char ch = sc.next().charAt(0);

        char ch1= Character.toUpperCase(ch);



        System.out.print("Original string: "+ str);
        String result = RemoveCharacter(str, ch, ch1);
        System.out.println("\nSecond string: "+result);

    }
    public static String RemoveCharacter(String str, char ch, char ch1) {

        if (str == null || str.isEmpty())
        {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        char[] chArray = str.toCharArray();

        for (int i = 0; i < chArray.length; i++)
        {
            if (chArray[i] != ch && chArray[i] != ch1)
            {
                sb.append(chArray[i]);
            }
        }
        return sb.toString();
    }
}
