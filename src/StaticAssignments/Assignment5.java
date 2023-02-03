package StaticAssignments;

public class Assignment5
{
        static void staticMethod()
        {
            System.out.println("This is static Method ");
        }

         void instanceMethod()
        {
            System.out.println("This is instance method calling static method......");
            staticMethod();

        }

        public static void main(String[] args)
        {
            Assignment5 assignment5 = new Assignment5();
            assignment5.instanceMethod();
        }

    }
