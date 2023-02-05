package ThisAndSuperDemo;

public class ParametricConstructorUsingThis
{
    public ParametricConstructorUsingThis(int x, int y )
    {
        System.out.println("The value of x is " + x + " and y is " + y);
    }

    public ParametricConstructorUsingThis(){
        this(10,20);
    }

    public static void main(String[] args) {
        ParametricConstructorUsingThis metric = new ParametricConstructorUsingThis();

    }


}
