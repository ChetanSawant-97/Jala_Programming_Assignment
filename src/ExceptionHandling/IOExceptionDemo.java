package ExceptionHandling;

import java.io.IOException;

public class IOExceptionDemo
{
    public static void main(String[] args) throws Exception {
        try {
            String str = "AayushSaini";
            byte[] bytes;
            // Encoding the string using invalid format causing
            // UnsupportedEncodingException is thrown in such cases
            bytes = str.getBytes("UTF");
        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
