package program_6;

import java.util.*;
public class DupliWord {

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a  string: ");
        String str=sc.nextLine();

        str=str.toLowerCase();
        String[] words = str.split(" ");

        int length = words.length;
        int count1=0;
        System.out.print("Duplicate Words are: ");

        for( int i=0; i < length; i++)
        {
            // Set count to 1 for every iteration
            int count = 1;
            for(int j=i+1; j < length; j++)
            {
                if(words[i].equals(words[j]))
                {
                    count++;

                    words[j] = "0";
                }
            }
                if (!words[i].equals("0") && count > 1)
                {
                    System.out.print(" " + words[i] + " ");
                    count1++;
                }
        }
        System.out.println("\nTotal duplicate words: "+count1);
    }
}
