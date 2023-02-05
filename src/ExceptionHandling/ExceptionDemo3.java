package ExceptionHandling;

public class ExceptionDemo3
{
    public static int divide()
    {
        return 25/0;
    }

    public static void main(String[] args) {

        try {
            divide();
        }catch (ArithmeticException e)
        {
            e.printStackTrace();
        }catch (NullPointerException e)
        {
            e.printStackTrace();
        }catch (ClassCastException e){
            e.printStackTrace();
        }


    }
}
