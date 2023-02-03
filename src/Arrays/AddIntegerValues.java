package Arrays;

public class AddIntegerValues
{
    public static void sumOfArraysValues(int[] arr)
    {
        int sum = 0;
        for(int i : arr){
            sum = sum + i;
        }

        System.out.println("Sum of all the Integer Values is = " + sum);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,6,8,9};
        sumOfArraysValues(arr);
    }
}
