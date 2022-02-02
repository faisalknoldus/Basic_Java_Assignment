package program_9;
class Bank
{
    String location;
    float rateofreturn;
    Bank(String location,float rateofreturn)
    {
        this.location = location;
        this.rateofreturn=rateofreturn;
    }
    public void getDetails()
    {
        System.out.println("\nBank Location: "+ location +"\nROI: "+rateofreturn);
    }
}

class SBI extends Bank
{
    String branchId;
    public SBI(String city, float ror, String branchId)
    {
        super(city, ror);
        this.branchId = branchId;
        
        
    }
    
    public void getDetails()
    {
        super.getDetails();
        System.out.println("Branch Id: "+ branchId);
    }
}
class BOI extends Bank
{
    String branchId;
    public BOI(String city,float ror,String branchId)
    {
        super(city, ror);
        this.branchId=branchId;
    }
    
    public void getDetails()
    {
        super.getDetails();
        System.out.println("BranchId: "+ branchId);
    }
}


class ICICI extends Bank
{
    String branchId;
    public ICICI(String city, float ror, String branchId)
    {
        super(city, ror);
        this.branchId=branchId;
    }
    
    public void getDetails()
    {
        super.getDetails();
        System.out.println("BranchId: "+ branchId);
    }
}

public class BankDetail {
    public static void main(String[] args)
{
    Bank bank =new Bank("Kanpur",1.5f);
    SBI sbi= new SBI("Noida",1.3f,"SBI8895");
    BOI boi= new BOI("Greater Noida",1.4f,"BOI6477");
    ICICI icici=new ICICI("New Delhi",1.0f,"ICICI8523");
    
    bank.getDetails();
    sbi.getDetails();
    boi.getDetails();
    icici.getDetails();
}
}

