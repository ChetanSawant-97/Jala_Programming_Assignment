package ExceptionHandling;

public class NoSuchMethodDemo
{
    public static void main(String[] args) throws Exception{

        NoSuchMethodDemo demo2 = new NoSuchMethodDemo();
        Class cls = demo2.getClass();
        cls.getMethod("getInfo");
    }
}
