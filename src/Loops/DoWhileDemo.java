package Loops;

public class DoWhileDemo
{
    public static void print()
    {
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        }while(i<=10);
    }

    public static void main(String[] args) {
        print();
    }
}
