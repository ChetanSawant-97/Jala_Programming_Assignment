package Inheritance;

public class B extends A{
    void firstOfB()
    {
        System.out.println("Class B first method");
    }
    void secondOfB()
    {
        System.out.println("Class B second method");
    }

    @Override
    void third() {
        System.out.println("Overriden Method in B Class");
    }
}
