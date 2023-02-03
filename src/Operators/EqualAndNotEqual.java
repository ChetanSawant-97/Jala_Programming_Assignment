package Operators;

public class EqualAndNotEqual
{
    //equals Operator
    public static boolean equalOperator(int a, int b)
    {
         return a==b;
    }

    //Notequals Operator
    public static boolean notEqualOperator(int a, int b)
    {
        return a!=b;
    }


    public static void main(String[] args) {

        System.out.println("Is A and B are equal = " +  equalOperator(10,10));
        System.out.println("Is A and B are Not Equal = " +  notEqualOperator(10,10));

    }

}
