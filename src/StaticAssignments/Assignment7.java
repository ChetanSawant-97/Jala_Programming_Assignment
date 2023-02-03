package StaticAssignments;

public class Assignment7
{
    void instanceMethod()
    {
        System.out.println("This is Instance Method ");
    }

    static void staticMethod()
    {
        System.out.println("This is static method ");
       

    }

    public static void main(String[] args) {
        staticMethod();

        Assignment7 assignment7 = new Assignment7();
        assignment7.instanceMethod();
    }
}
