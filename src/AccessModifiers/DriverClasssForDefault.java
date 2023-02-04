package AccessModifiers;

public class DriverClasssForDefault
{
    public static void main(String[] args) {
        ClassWithDefaultProps defaultProps = new ClassWithDefaultProps();

        System.out.println(defaultProps.num2);
        System.out.println(defaultProps.num1);

        System.out.println(defaultProps.getAddition());
        System.out.println(defaultProps.getProduct());
    }
}
