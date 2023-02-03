package Operators;

public class PrintSmallerlarger
{
    public static void checkNumber(int a, int b)
    {
       if(a>b){
           System.out.println( a + " is larger number " + b + " is smaller number");
       } else if (a < b) {
           System.out.println(b + " is larger number " + a + " is smaller number ");
       }else{
           System.out.println( a + " is equals to " + b);
       }
    }

    public static void main(String[] args) {
        checkNumber(10, 12);
    }
}
