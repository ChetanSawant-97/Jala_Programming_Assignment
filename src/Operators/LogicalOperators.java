package Operators;

public class LogicalOperators
{
    public static void chekNum(int a, int b){
        if (a==b && a>10){
            System.out.println("A is equal b and a is greater than 10");
        } else if (a==b || a>10) {
            if (a==b){
                System.out.println("A is equals to B but not greater than 10");
            }else{
                System.out.println("A is not equals to b but is greater than 10");
            }
        } else if (a != 5) {
            System.out.println("A is not Equals to 5 ");
        }
    }

    public static void main(String[] args) {
        chekNum(11,11);

        chekNum(22,12);

        chekNum(6,4);

    }
}
