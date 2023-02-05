package MethodOverloading;

public class OverloadingDemo5
{
    public static String accDetails(String user, String email)
    {
        return "User name is " + user;
    }

    /* cannot create method with same name & signature but different return
    public static int accDetails(String user, String email){
        return 132645;
    }
     */
}
