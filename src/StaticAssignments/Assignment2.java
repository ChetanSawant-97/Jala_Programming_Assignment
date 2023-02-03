package StaticAssignments;

public class Assignment2
{
    String name = "Chetan";
    String sirname = "Sawant";

    static void printInstance()
    {
        Assignment2 assignment2 = new Assignment2();

        System.out.println(assignment2.name +" " + assignment2.sirname);
    }

    public static void main(String[] args) {
        printInstance();
    }

}
