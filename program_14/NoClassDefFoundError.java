package program_14;
public class NoClassDefFoundError {
    static class knolls
    {
        void java()
        {
            System.out.println( "Java" );
        }
    }
    static class Scala extends knolls
    {
        void showScala()
        {
            System.out.println( "Scala" );
        }
    }
    static class NoClassDefFoundErrorExample
    {
        public static void main(String[] args)
        {
            Scala data = new Scala();
            data.showScala();
            data.java();
        }
    }
}
