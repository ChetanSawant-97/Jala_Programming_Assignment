package InterfaceDemo;

public class ImplementationWithProps implements InterfaceWithMethodsAndProps
{

    @Override
    public void printDetails(String name, String sirname) {
        System.out.println(name + " " + sirname);
    }

    @Override
    public void printId() {
        System.out.println("342156");
    }

    public static void main(String[] args) {
        ImplementationWithProps withProps = new ImplementationWithProps();
        withProps.printDetails(ImplementationWithProps.name, ImplementationWithProps.sirname);
    }
}
