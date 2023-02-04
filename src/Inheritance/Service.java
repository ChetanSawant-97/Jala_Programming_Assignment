package Inheritance;

public class Service
{
    public static void main(String[] args) {
        A classA = new A();
        B classB = new B();
        C classC = new C();


        //methods of Class A
        classA.first();
        classA.second();

        //methods of Class B
        classB.firstOfB();
        classB.secondOfB();

        //mthods of C
        classC.firstOfC();
        classC.secondOfC();

        //Overriden Methods
        classC.third(12,2);
        classB.third(12,2);
        classA.third(12,2);



    }
}
