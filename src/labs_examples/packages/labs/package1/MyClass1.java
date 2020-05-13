package labs_examples.packages.labs.package1;
import labs_examples.packages.labs.package2.MyClass2;

public class MyClass1 {
    public static void main(String[] args) {
        int x = add(7,3);
        System.out.println("x = " + x);
    }
    private int  multiply(int a, int b){
        return a * b;
    }
    public double divide(int a, int b) { return a/b;}
}
