package Arrays;

public class ReverseArray
{
    public static void reverseArray(int[] arr)
    {
        int[] newArr = new int[arr.length];
        for (int i = arr.length-1, k=0; i >=0; i--, k++)
        {
            newArr[k] = arr[i];
        }

        for (int item : newArr )
        {
            System.out.print(item + ", ");
        }
    }


    public static void main(String[] args) {
        reverseArray(new int[]{1,2,3,4,5,6,7,8,9});
    }



}
