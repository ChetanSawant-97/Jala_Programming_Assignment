package Inheritance;

public class A
{
    int num1;
    int num2;

    public A() {
    }

    public A(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    void first()
    {
        System.out.println("Class A first method");
    }
    void second()
    {
        System.out.println("Class A second method");
    }
    void third(int num1, int num2)
    {
        System.out.println("This is third method from Class 'A' \n" + (num1 - num2) + " Is the difference of "+ num1  +" "+ num2);
    }
}
