package MethodOverloading;

public class OverloadingDemo2
{
    public static void getInfo(String name, int userId)
    {
        System.out.println("USer with uername " + name+ " and id " + userId);
    }
    public static void getInfo(String name, int userId, String accStatus)
    {
        System.out.println("USer with uername " + name+ " and id " + userId + " accoutn status is " + accStatus );
    }


    public static void main(String[] args) {
        getInfo("Chetan", 13495);
        getInfo("Manav", 246895, "Active");
    }
}