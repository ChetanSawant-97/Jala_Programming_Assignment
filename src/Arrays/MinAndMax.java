package Arrays;

public class MinAndMax
{
    public static void findMax(int[] arr)
    {
        int max = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (max < arr[i])
            {
                max = arr[i];
            }
        }
        System.out.println("Maximum is " + max);
    }

    public static void findMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++)
        {

            if (min> arr[i])
            {
                min = arr[i];
            }
        }
        System.out.println("Minimum is " + min);
    }


    public static void main(String[] args) {
        findMax(new int[]{1,2,3,9,85,45,12});
        findMin(new int[]{1,2,3,9,85,45,12});
    }
}
