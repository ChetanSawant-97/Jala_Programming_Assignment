package ThisAndSuperDemo;

public class SuperDemo extends PrintVars
{
    public void printCollegeDet()
    {
        System.out.println("College name is " + super.college +  " of University "+ super.university );
    }
    public static void main(String[] args) {
        SuperDemo demo = new SuperDemo();
        demo.printCollegeDet();
    }
}
