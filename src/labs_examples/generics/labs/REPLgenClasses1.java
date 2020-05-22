package labs_examples.generics.labs;

public class REPLgenClasses1 {

    public static void main(String[] args) {

        // Step 1) Create an object of the Generic class below and call the print() method on it
        MyGeneric<String, Integer> obj1 = new MyGeneric("Hello", 2020);
        obj1.print();

        // Step 2) Create another object of the Generic class below using a different data type and call the print() method on it
        MyGeneric<Integer, String > obj2 = new MyGeneric(25, "years old");
        obj2.print();

        // Step 3) modify the class below to require two generic types - then modify your objects above so it still works
    }
}

    class MyGeneric <T, V> {

        T val1;
        V val2;


        public MyGeneric(T val1, V val2) {
            this.val1 = val1;
            this.val2 = val2;
        }

        public void print(){
            System.out.println(val1+" , " + val2);
        }
    }

