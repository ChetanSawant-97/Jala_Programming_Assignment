package ExceptionHandling;

public class ExceptionDemo1
{
    public static int division()
    {
        return 2/0;
    }

    public static void main(String[] args) {
        try {
            division();
        }catch (ArithmeticException e)
        {
            e.printStackTrace();
        }
        System.out.println("End of Programm");
    }
}
