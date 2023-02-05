package ThisAndSuperDemo;

public class PrintVars
{
    String college = "GCOEARA";
    String university = "SPPU";


    public void printDetails()
    {
        System.out.println(this.college + " " + this.university);
    }

    public static void main(String[] args) {
        PrintVars vars = new PrintVars();
        vars.printDetails();

    }

}
