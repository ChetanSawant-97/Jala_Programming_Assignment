package Operators;

public class EqualOrNot
{
    public static void isEqual(int a , int b)
    {
        if (a==b) {
            System.out.println("Both numbers are Equal");
        }else{
            System.out.println("two numbers are not Equal");
        }
    }

    public static void main(String[] args) {

        isEqual(10,10);
    }

}
