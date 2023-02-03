package Loops;

public class OddEvenNum
{
    public static void printOddEven(int num)
    {
        System.out.println("Even Numbers are");
        for (int i=2; i<=num; i++)
        {

            if (i%2==0){
                System.out.print(i + ", ");
            }
        }

        System.out.println("\nOdd Numbers are");
        for (int i=2; i<=num; i++)
        {

            if (i%2!=0){
                System.out.print(i +", ");
            }
        }
    }

    public static void main(String[] args) {
        printOddEven(22);
    }
}
