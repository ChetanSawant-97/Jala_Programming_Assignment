package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertElem
{

        // Method to add element at position
        private static void addElement(
                Integer[] arr, int element,
                int position)
        {
            // Converting array to ArrayList
            List<Integer> list = new ArrayList<>(
                    Arrays.asList(arr));

            // Adding the element at position
            list.add(position - 1, element);

            // Converting the list back to array
            arr = list.toArray(arr);



            for (int item: arr)
            {
                System.out.print(item +", ");
            }

        }


    public static void main(String[] args)
    {
        // Sample array
        Integer[] arr = { 1, 2, 3, 4, 5,
                6, 7, 8, 9, 10 };

        // Element to be inserted
        int element = 50;

        // Position to insert
        int position = 5;

        // Calling the function to insert
        addElement(arr, element, position);
    }
}
