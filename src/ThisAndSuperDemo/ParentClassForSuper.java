package ThisAndSuperDemo;

public class ParentClassForSuper
{
    public ParentClassForSuper()
    {
        System.out.println("This is Parent Class default constructor");
    }
    public ParentClassForSuper(String info){
        System.out.println("This Parent Class Parametric Constructor " + info);
    }

    public void printInfo()
    {
        System.out.println("This is printInfo from Parent Class");
    }
}
