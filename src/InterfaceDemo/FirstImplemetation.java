package InterfaceDemo;

public class FirstImplemetation implements FirstDemoInterface{


    @Override
    public void printName(String name) {
        System.out.println("Your name is " + name);
    }

    public static void main(String[] args) {
        FirstImplemetation implemetation = new FirstImplemetation();
        implemetation.printName("Chetan");
    }
}
