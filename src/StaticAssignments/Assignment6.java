package StaticAssignments;

public class Assignment6
{
    static String firstStaticvar = "Chetan";
    static String secondStaticvar = "Sawant";

    String firstIntance = "Manav ";
    String secondInstance = "Singh";

    public static void main(String[] args) {
        Assignment6 assignment6 = new Assignment6();
        System.out.println("Printing instances " + assignment6.firstIntance +" " + assignment6.secondInstance);
        System.out.println("Printing Static Variables " + firstStaticvar+ " "+ secondStaticvar);
    }
}
