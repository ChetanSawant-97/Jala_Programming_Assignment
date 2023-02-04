package Inheritance;

public class B extends A{

    String name;
    String sirname;

    public B(String name, String sirname) {
        this.name = name;
        this.sirname = sirname;
    }

    public B() {
    }

    void firstOfB()
    {
        System.out.println("Class B first method");
    }
    void secondOfB()
    {
        System.out.println("Class B second method");
    }

    @Override
    void third(int num1, int num2) {
        System.out.println("This is third method from Class B \n" + num1 + num2 + " Is the sum of "+ num1  +" "+ num2 );
    }
}
