
/* 1.Program to check P?P in the String */
package program_1;
import java.util.*;
public class PopSub
{
    public boolean checkPop(String str)
    {
        int len = str.length();
        for (int i = 0; i < len - 2; i++)
        {
            if (str.charAt(i) == 'p'&& str.charAt(i+2) == 'p')
                return true;
        }
        return false;
    }
    public static void main (String[] args)
    {
        PopSub obj = new PopSub();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check,'POP' is existing in it or not : ");

        String str1 = sc.nextLine();
        str1=str1.toLowerCase();

        System.out.println(obj.checkPop(str1));
    }
}
