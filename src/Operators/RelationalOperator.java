package Operators;

public class RelationalOperator
{
    public static void chekRelation(int a, int b)
    {
        if ( a< b ){
            System.out.println("A is less than B");
        } else if (a > b ) {
            System.out.println();
        }
    }

    public static void checkEqual(int a, int b)
    {
        if (a >=b){
            System.out.println("A is either greater or equal to B ");
        } else if (a <=b ) {
            System.out.println("A is either less or equal to B");
        }
    }

    public static void main(String[] args) {
        chekRelation(10,20);
        checkEqual(20,10);

    }

}
