package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class OddAndEven
{
    public static void oddAndEven(int[] arr)
    {
        int arr_size = arr.length;
        int even_count = 0;
        int odd_count = 0;

        // loop to read all the values in
        // the array
        for (int i = 0; i < arr_size; i++) {

            // checking if a number is
            // completely divisible by 2
            if ((arr[i] & 1) == 1)
                odd_count++;
            else
                even_count++;
        }

        System.out.println("Number of even"
                + " elements = " + even_count
                + " Number of odd elements = "
                + odd_count);
        }


    public static void main(String[] args) {
        oddAndEven(new int[]{1,2,4,6,10,12,13,});
    }
}
