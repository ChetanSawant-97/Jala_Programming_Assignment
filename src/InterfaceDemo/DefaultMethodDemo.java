package InterfaceDemo;

public class DefaultMethodDemo implements InterfaceWithDefaultMethods{
    @Override
    public void auditStatus() {
        System.out.println("Audit is ongoing");
    }

    public static void main(String[] args) {
        DefaultMethodDemo methodDemo = new DefaultMethodDemo();
        methodDemo.auditStatus();
    }
}
