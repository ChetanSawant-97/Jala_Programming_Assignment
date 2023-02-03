package Arrays;

public class IfContains {
    public static void ifExist(int[] arr, int a, int b)
    {
        for (int item : arr) {
            if (item == a){
                System.out.println(a+" Exists in the array");
            }

            if (item==b)
            {
                System.out.println(b + " Exists in the array");
            }
        }
    }

    public static void main(String[] args) {
        ifExist(new int[]{1,2,3,4,5,6,8,9,10}, 2, 6);
    }
}
