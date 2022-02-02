package program_8;
    public class UseOfStatic
    {
        // static variable
        static int age= 23;

        // static block
        static
        {
            String FirstName="Mohd";
            System.out.println("First Name: "+FirstName);
        }

        // static method
        static void Lastname()
        {

            String LastName="Faisal";
            System.out.println("Last Name: "+LastName);
        }

        public static void main(String[] args)
        {
            Lastname();
            System.out.println("Age: "+age);
        }
    }

