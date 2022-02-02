
/* 2.Program to sort Binary Array */
package program_2;
import java.util.*;

class BnryArray
{

    public static void SortBinaryNum(int Arr[] )
    {
        int k = 0;

        for (int i = 0; i < Arr.length; i++)
        {
            if (Arr[i] == 0)
            {
                Arr[k++] = 0;
            }
        }

        for (int i = k; i < Arr.length; i++)
        {
            Arr[k++] = 1;
        }
    }

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array: ");

        int n = sc.nextInt();
        int Arr[] = new int[n];

        System.out.print("Enter Binary Array: ");
        for(int i=0;i<n;i++)
            Arr[i]=sc.nextInt();

        System.out.println("Original array: "+Arrays.toString(Arr));
        SortBinaryNum(Arr);
        System.out.println("After sorting: "+Arrays.toString(Arr));

    }
}
