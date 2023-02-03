package Arrays;

public class CopyElem
{
    public static void copyArray(int[] arr)
    {
        int[] newArra = new int[arr.length-1];

        for (int i = 0; i<=arr.length-1; i++){

                newArra[i] = arr[i];
        }
        for (int i: newArra) {
            System.out.print(i + ", ");
        }
    }


    public static void main(String[] args) {
        copyArray(new int[]{1,2,3,6,9,5,12,10,32});
    }
}
