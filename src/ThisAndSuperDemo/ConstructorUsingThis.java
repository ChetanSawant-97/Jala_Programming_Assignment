package ThisAndSuperDemo;

public class ConstructorUsingThis
{
    ConstructorUsingThis(){
        System.out.println("Hello world");
    }
    ConstructorUsingThis(int x)
    {
        this();
        System.out.println("your id is " + x);
    }

    public static void main(String[] args) {
        ConstructorUsingThis thisDemo = new ConstructorUsingThis(10);
    }


}
