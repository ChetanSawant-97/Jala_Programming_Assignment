package Arrays;

public class AverageOfArray
{
    public static void averageArray(int[] arr)
    {
        int n = arr.length;

        double sum = 0;
        for (double i : arr)
        {
           sum = sum + i;
        }

        double avg = sum/n;
        System.out.println("Average of Integer values of Array is = " + avg);
    }

    public static void main(String[] args) {
        int[] arr = {2,4,10,11};
        averageArray(arr);
    }
}
