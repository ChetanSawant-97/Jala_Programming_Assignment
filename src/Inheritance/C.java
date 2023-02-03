package Inheritance;

public class C extends B{
    void firstOfC()
    {
        System.out.println("Class C first method");
    }
    void secondOfC()
    {
        System.out.println("Class C second method");
    }

    @Override
    void third() {
        System.out.println("Overriden Method in C Class");
    }
}
