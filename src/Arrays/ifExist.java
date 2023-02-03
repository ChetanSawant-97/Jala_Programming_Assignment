package Arrays;

public class ifExist
{
    public static void ifExist(int[] arr, int num)
    {
        boolean result = false;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == num)
            {
                result= true;
            }
        }

        if (result){
            System.out.println(num +" Exists in the given array ");
        }else{
            System.out.println(num +" Does not Exists ");
        }

    }

    public static void main(String[] args) {
        ifExist(new int[]{1,2,3,4,5,6,7}, 24);
    }
}
