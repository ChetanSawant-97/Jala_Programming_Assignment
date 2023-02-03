package Arrays;

public class SecondLargest
{
    public static int secondLargest(int[] arr)
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
        return arr[arr.length-2];
        }

        public static void main(String[] args) {
        System.out.println(secondLargest(new int[]{1,2,3,6,8,7,6,10}));
    }
}
