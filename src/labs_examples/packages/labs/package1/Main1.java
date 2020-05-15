package labs_examples.packages.labs.package1;

import labs_examples.packages.labs.package2.MyClass2;

public class Main1 {
    public static void main(String[] args) {
        MyClass2 obj = new MyClass2();
        // I cannot call Myclass2 methods add(..) and subtract(..) because
        // add(..) is protected (can be used within the package2 only)
        // and subtract (..) is default the same as protected
    }
}
