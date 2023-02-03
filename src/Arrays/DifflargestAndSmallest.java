package Arrays;

public class DifflargestAndSmallest
{
    public static void difference(int[] arr)
    {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        System.out.println("Difference between largest and smallest is = " + (arr[arr.length-1]-arr[0]));
    }

    public static void main(String[] args) {
        difference(new int[]{39,2,3,4,5,6,9,40});
    }

}
