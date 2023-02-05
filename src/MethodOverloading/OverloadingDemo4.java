package MethodOverloading;

public class OverloadingDemo4
{
    public static void postUser(String name, int id)
    {
        System.out.println("User with username "+ name + " and user id " + id +" is submitted");
    }

    public static void postUser (String name, String email)
    {
        System.out.println("User with username "+ name + " and user email " + email +" is submitted");
    }

    public static void main(String[] args) {
        postUser("Chetan", 134695);
        postUser("Chetan" , "sawantchetan8149@gmail.com");
    }
}
