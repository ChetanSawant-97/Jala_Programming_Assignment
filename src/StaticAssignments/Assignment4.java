package StaticAssignments;

public class Assignment4 {
    void instanceMethod()
    {
        System.out.println("This is Instance Method ");
    }

    static void staticMethod()
    {
        System.out.println("This is static method calling instance method......");
        Assignment4 assignment4 = new Assignment4();
        assignment4.instanceMethod();

    }

    public static void main(String[] args) {
        staticMethod();
    }

}
