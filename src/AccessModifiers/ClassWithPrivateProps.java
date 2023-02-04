package AccessModifiers;

public class ClassWithPrivateProps
{
    private String name;
    private String sirname;

    public ClassWithPrivateProps()
    {

    }

    public ClassWithPrivateProps(String name, String sirname) {
        this.name = name;
        this.sirname = sirname;
    }

    private String getName()
    {
        return this.name;
    }
    private String getSirname()
    {
        return this.sirname;
    }

    public static void main(String[] args) {
        ClassWithPrivateProps privateProps = new ClassWithPrivateProps("Chetan", "Sawant");

        System.out.println(" Name is "+privateProps.getName()+" and sirname is "+ privateProps.getSirname() );

    }


}
