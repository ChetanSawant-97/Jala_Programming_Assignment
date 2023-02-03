package Operators;

public class ArithmeticOperatorsDemo {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a/b;
    }

    public static int div(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println("Sum of A and B is = "  + add(10,20));
        System.out.println("Sub of A and B is = " +  sub(10,20));
        System.out.println("Product of A and B is = " + mul(10,20));
        System.out.println("Division of A and B is = " + div(10,20));


    }


}
