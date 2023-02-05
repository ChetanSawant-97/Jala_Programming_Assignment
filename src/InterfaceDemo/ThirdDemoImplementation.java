package InterfaceDemo;

public class ThirdDemoImplementation implements ThirdDemoInterface1,ThirdDemoInterface2
{
    @Override
    public void printId() {
        System.out.println("Your User Id id 234565");
    }

    @Override
    public void printName()
    {
        System.out.println("Username is Chetan");
    }
}
