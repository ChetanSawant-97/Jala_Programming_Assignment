package Arrays;

public class RemoveNumber
{
    public static void removeNum(int[] arr, int num)
    {
        int[] newArra = new int[arr.length-1];

        for (int i = 0, k=0; i<=arr.length-1; i++){
            if (arr[i]!=num) {
                newArra[k] = arr[i];
                k++;
            }
        }
        for (int i: newArra) {
            System.out.print(i + ", ");
        }
    }

    public static void main(String[] args) {
        removeNum(new int[]{1,2,3,6,9,5,12,10,32}, 12);
    }
}
