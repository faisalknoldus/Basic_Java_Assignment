package program_21;
import java.util.Scanner;
class Employee{
    private int Eid;
    private String Ename;
    private String Edeg;
    Employee(int eid,String enm,String edeg)
    {
        this.Eid=eid;
        this.Ename=enm;
        this.Edeg=edeg;
    }
    public String display()
    {
        return "id :"+Eid+" name: "+ Ename +" designation: "+Edeg;
    }
}

public class Maintainlist{
    public static void  main(String[] args)
    {
        int n,i,inc;
        n=Integer.parseInt(args[0]);
        i=Integer.parseInt(args[1]);
        inc=Integer.parseInt(args[2]);
        Employee emp[]=new Employee[n];
        int id;
        String nm;
        String deg;
        Scanner sc= new Scanner(System.in);
        for(int v=i;v<n;v+=inc)
        { 
             id=sc.nextInt();
             nm=sc.nextLine();
             deg=sc.nextLine();
            emp[i]= new Employee(id,nm,deg);
            System.out.println(emp[i].display());
        }
    }
}
