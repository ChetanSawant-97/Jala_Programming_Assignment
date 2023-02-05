package ThisAndSuperDemo;

public class ChildClassForSuper extends ParentClassForSuper
{

    public ChildClassForSuper(){
        super("Calling Parametric Constructor");
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("This is Child CLass info method");
    }

    public static void main(String[] args) {
        ChildClassForSuper child = new ChildClassForSuper();
        child.printInfo();
    }
}
