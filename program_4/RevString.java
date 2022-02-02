package program_4;

import java.util.*;
public class RevString
{
    public static String ReverseString(String s)
    {
        StringBuilder r= new StringBuilder();
        for(int i=s.length(); i>0; --i)
        {
            r.append(s.charAt(i - 1));
        }
        return r.toString();
    }
    public static void main(String[] args)
    {
        String str;
        System.out.print("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();

        String str1 = ReverseString(str);
        System.out.println("The reversed string is: " + str1);
    }

}