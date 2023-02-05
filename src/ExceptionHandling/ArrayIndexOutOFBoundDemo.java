package ExceptionHandling;

public class ArrayIndexOutOFBoundDemo
{

    //this will throw ArryIndexOutOfBoundException because i am trying to access element at index 5 but array length is 4 i.e max index is 3
    public static void updateElem(){
        int[] arr = {1,2,3,4};

        arr[5] = 45;
    }


    public static void main(String[] args) {
        try {
            updateElem();
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch(ArithmeticException e){
            e.printStackTrace();
        }
    }


}
