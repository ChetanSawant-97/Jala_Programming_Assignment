package AccessModifiers;

public class DriverClassForPrivate extends ClassWithPrivateProps
{
    public static void main(String[] args) {

        ClassWithPrivateProps privateProps = new ClassWithPrivateProps("Chetan", "Sawant");

        //Can not access private members of a classs


    }
}
