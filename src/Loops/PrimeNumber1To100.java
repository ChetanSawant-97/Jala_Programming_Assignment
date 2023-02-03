package Loops;

public class PrimeNumber1To100
{

    public static void printPrime()
    {
        int primeCheckNumber;
        int n = 10;
        int divisibleCount;

        while (n <= 100) {
            divisibleCount = 0;
            primeCheckNumber = 2;
            while (primeCheckNumber <= n / 2) {
                if (n % primeCheckNumber == 0) {
                    divisibleCount++;
                    break;
                }
                primeCheckNumber++;
            }
            if (divisibleCount == 0 && n != 1) {
                System.out.print(n + " ");
            }
            n++;
        }
    }

    public static void main(String[] args) {
        printPrime();
    }
}
