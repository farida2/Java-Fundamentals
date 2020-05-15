package labs_examples.packages.labs.package2;
import labs_examples.packages.labs.package1.MyClass1;

public class Main2 {
    public static void main(String[] args) {
        MyClass1 obj1 = new MyClass1();
        double x = obj1.divide(6,2);
        System.out.println("x = " + x);
    }
}
