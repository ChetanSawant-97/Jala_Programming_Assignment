package StaticAssignments;

public class Assignment3
{
    static String name = "Chetan";
    static String sirname = "Sawant";

    void printStatic(){
        System.out.println(name +" " + sirname);
    }

    public static void main(String[] args) {
        Assignment3 assignment3 = new Assignment3();
        assignment3.printStatic();
    }
}
