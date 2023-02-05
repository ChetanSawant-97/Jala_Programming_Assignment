package Constructors;

public class ChildClass extends ParentClass
{
    public ChildClass()
    {
        super();
    }
    public ChildClass(String name)
    {
        super("Calling Oarent Class parametric Constructor");

    }

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        ChildClass childClass1 = new ChildClass("Chetan");
    }
}
