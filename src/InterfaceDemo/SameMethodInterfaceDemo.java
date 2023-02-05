package InterfaceDemo;

public class SameMethodInterfaceDemo implements SameMethodInterface1, SameMethodInterface2
{
    @Override
    public void printData(String data) {
        System.out.println("This is your " + data);
    }


    public static void main(String[] args) {
        SameMethodInterfaceDemo demo = new SameMethodInterfaceDemo();
        demo.printData("Chetan Sawant");
    }

}
