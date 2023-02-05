package MethodOverloading;

public class OverloadingDemo1
{
    public static void printInfo(String name, String sirname)
    {
        System.out.println("User name is "+ name + " " + sirname);
    }
    public static void printInfo(String name, String middlename, String sirname){
        System.out.println("User name is " + name + " " + middlename + " "+ sirname);
    }


    public static void main(String[] args) {
        printInfo("Chetan", "Sawant");
        printInfo("Chetan", "Samjay", "Sawant");
    }
}
