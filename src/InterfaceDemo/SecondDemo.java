package InterfaceDemo;

/* need to provide abstract because we have not implmented all the methods
 from interface */

abstract public class SecondDemo implements SecondDemoInterface
{
    //implemented method
    public void printStatus(String status)
    {
        System.out.println("Your status is "+ status);
    }


    //we can not create instance of interface
    //follwing is the way we can create anonymous class which is implementing interface
    SecondDemoInterface DemoInterface = new SecondDemoInterface() {
        @Override
        public void printStatus(String status) {
            System.out.println(" User status is " + status);
        }

        @Override
        public void printId(int id) {

        }
    };


    public static void main(String[] args) {

    }
}
