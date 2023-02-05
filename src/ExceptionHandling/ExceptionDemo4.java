package ExceptionHandling;

public class ExceptionDemo4
{
    public static int substract(int num, int num2) throws Exception
    {
        int marks = num -num2;

        if (marks >= 0){
            throw new Exception("Marks cant be less than zero");
        } else if (marks <= 100) {
            throw new Exception("Marks cant be more than 100");
        }
        return marks;
    }

    public static void main(String[] args) throws Exception {
        substract(5,10);
    }


}
