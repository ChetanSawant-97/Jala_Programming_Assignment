package MethodOverloading;

public class OverloadingDemo3
{
    public static void userDetails(String name, int id)
    {
        System.out.println("User details are " + name + " " + id);
    }

    //You cant create methods with same signature and same name in the same class
//    public static void userDetails(String name, int id)
//    {
//        System.out.println("User details are " + name + " " + id);
//    }

    public static void main(String[] args) {

    }
}
