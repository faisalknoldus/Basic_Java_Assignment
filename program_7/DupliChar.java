package program_7;
 import java.util.*;
public class DupliChar
{

    public static int CharOccurence(String str, String str1)
    {   String str2=str.replace(str1,"");
        int num;
        num =str.length()-(str2.length());
       return num;
    }
    public static void main(String[] args)
    {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str=sc.nextLine();
        str=str.toLowerCase();

        System.out.print("Enter a character to check occurrence: ");
        String str1=sc.nextLine();
        str1=str1.toLowerCase();

        int n=CharOccurence(str,str1);
        System.out.printf("Number of Occurrence of '%s' is: %d ",str1,n);


    }

}
