package ExceptionHandling;

public class ClassNotFoundExceptionDemo
{

    public static void main(String args[])
    {

        try {

            Class.forName("UserDefinedException");
        }


        catch (ClassNotFoundException ex) {

            ex.printStackTrace();
        }
    }
}
