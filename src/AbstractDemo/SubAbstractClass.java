package AbstractDemo;

public class SubAbstractClass extends AbstractDemo{
    @Override
    public void printStatus(String status) {
        System.out.println("User is " + status);
    }

    //    Can Not Create object of Abstract Class
    //    AbstractDemo demo = new AbstractDemo();



    public static void main(String[] args) {
        SubAbstractClass driver = new SubAbstractClass();

        driver.printName();  //Non Abstract Method

        driver.printStatus("Active");  //Abstract Method implemented in this class
    }


}
