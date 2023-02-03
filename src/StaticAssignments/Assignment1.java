package StaticAssignments;

public class Assignment1 {
    static String firstStaticvar;
    static String secondStaticvar;

    String firstIntance;
    String secondInstance;

    static void firstStaticMethod()
    {
        System.out.println("This is First static method");
    }

    static void secondStaticMethod(){
        System.out.println("This is Second static method");
    }

    void firstInstanceMethod(){
        System.out.println("This is First Instance method");
    }

    void secondInstanceMethod(){
        System.out.println("This is Second Instance method");
    }

    public static void main(String[] args) {

    }
}
