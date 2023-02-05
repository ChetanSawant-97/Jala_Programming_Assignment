package ExceptionHandling;

public class NoSuchFieldDemo
{
    public static void main(String[] args) throws Exception {
        NoSuchFieldDemo demo = new NoSuchFieldDemo();

        Class cls = demo.getClass();

        cls.getField("name");


    }
}
