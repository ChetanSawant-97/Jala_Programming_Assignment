package ExceptionHandling;

public class CustomExceptionDemo
{
    public static int getMarks(int num1, int num2) throws Exception
    {
        int marks = num1 - num2;
        if (marks >= 0){
            throw new CustomException();
        }else if(marks >=100){
            throw new CustomException();
        }

        return marks;
    }

    public static void main(String[] args) {
        try {
            getMarks(12,12);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
