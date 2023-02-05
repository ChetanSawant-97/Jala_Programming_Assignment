package ExceptionHandling;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class SQLExceptionDemo
{
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("", "", "");
        PreparedStatement stmt = con.prepareStatement("Select * from Customer_Mast");
        stmt.execute();
    }
}
