package ExceptionHandling;

public class ArithmeticExceptionDemo
{
    public static void getNumber(){
        int number = 4/0;

        System.out.println(number);
    }


    public static void main(String[] args) {
        try {
            getNumber();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
