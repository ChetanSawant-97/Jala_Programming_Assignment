package ExceptionHandling;

public class ExceptionFinallyDemo
{
    public static void getNum(){
        int num = 4/0;

        System.out.println(num);
    }

    public static void main(String[] args) {

        try {
            getNum();
        }catch(Exception e)
        {
            e.printStackTrace();
        }finally {
            System.out.println("This text is from finally block");
        }



    }
}
