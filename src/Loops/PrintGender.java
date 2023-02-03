package Loops;

public class PrintGender
{
    public static void printGender(String c){
        switch (c)
        {
            case "M": System.out.print("Male");
            break;
            case "F": System.out.println("Female");
            break;
            default:;
        }
    }

    public static void main(String[] args) {
        printGender("M");
    }
}
