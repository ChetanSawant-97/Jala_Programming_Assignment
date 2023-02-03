package Loops;

public class ArmstrongNumber {

    public static void armstrongNumber(int x){ int temp, last =0, digits=0, sum=0;

        temp = x;
        while(temp>0)
        {
            temp = temp/10;
            digits++;
        }

        temp = x;
        while(temp>0)
        {
            last = temp%10;
            sum += Math.pow(last, digits);
            temp = temp/10;
        }
        if(sum==x){
            System.out.println("Its an Armstrong Number");
        }else {
            System.out.println("Its not an Armstrong Number");
        }

    }

    public static void main(String[] args) {
        armstrongNumber(153);
    }
}
