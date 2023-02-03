package Arrays;

public class IndexOfDemo
{
    public static void cutsomIndexof(int[] arr, int num)
    {
        int result = -1;
        for (int i = 0; i<arr.length; i++)
        {
            if (arr[i] == num) {
                result = i;
            }

        }
        if (result != -1){
            System.out.println("Index of " +num+ " in given Array is "+ result);
        }else {
            System.out.println("Given Number doesnt exist in array ");
        }

    }

    public static void main(String[] args) {
        cutsomIndexof(new int[]{1,2,3,5,9,87,4}, 87);
    }
}
