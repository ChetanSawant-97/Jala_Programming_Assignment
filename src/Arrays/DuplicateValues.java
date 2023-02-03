package Arrays;

public class DuplicateValues
{
    public static void findDuplicate(int[] arr)
    {

        int[] newArr = arr.clone();
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }

    public static void main(String[] args) {
        findDuplicate(new int[]{11,2,3,4,5,11,5,8,9});
    }
}
