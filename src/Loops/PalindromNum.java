package Loops;

public class PalindromNum
{
    public static void isPlindrome(int num){
        int temp;
        int sum = 0;
        int r;
        temp = num;
        while(num > 0)
        {
            r = num%10;
            sum = (sum*10)+r;
            num = num/10;
        }
        if (temp == sum){
            System.out.println(temp + " is a Palindrome Number");
        }else {
            System.out.println(temp + " is not a palindrome Number ");
        }

    }

    public static void main(String[] args) {
        isPlindrome(454);
    }
}
