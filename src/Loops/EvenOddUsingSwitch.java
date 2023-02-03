package Loops;

public class EvenOddUsingSwitch
{
    public static void evenOrOdd(int num){
        switch (num%2){
            case 0 : System.out.print(num + " Is an Even Number");
            break;
            default: System.out.println(num + "is an Odd number");
            break;
        }
    }

    public static void main(String[] args) {
        evenOrOdd(10);
    }
}
