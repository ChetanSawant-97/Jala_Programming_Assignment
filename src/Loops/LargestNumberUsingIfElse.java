package Loops;

public class LargestNumberUsingIfElse
{
    public static void largestNumber(int n1, int n2, int n3)
    {
        if (n1 >= n2 && n1>=n3){
            System.out.println(n1 + " is the largest Number");
        } else if (n2>=n1 && n2>=n3) {
            System.out.println(n2 + " is the largest number");
        }else{
            System.out.println(n3 + " is the largest number");
        }
    }

    public static void main(String[] args) {
        largestNumber(40,80,10);
    }
}
