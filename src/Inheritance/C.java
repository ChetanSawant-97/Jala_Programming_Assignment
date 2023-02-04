package Inheritance;

public class C extends B{

    String cName;
    String cSirname;

    public C() {
    }

    public C(String cName, String cSirname) {
        this.cName = cName;
        this.cSirname = cSirname;
    }

    void firstOfC()
    {
        System.out.println("Class C first method");
    }
    void secondOfC()
    {
        System.out.println("Class C second method");
    }

    @Override
    void third(int num1, int num2) {
        System.out.println("This is third method from Class \n" + num1 * num2 + " Is the product of "+ num1  +" "+ num2 );
    }
}
