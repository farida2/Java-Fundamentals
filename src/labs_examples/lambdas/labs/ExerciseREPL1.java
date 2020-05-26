package labs_examples.lambdas.labs;

public class ExerciseREPL1 {
    public static void main(String[] args) {

        // Step 1) Please demonstrate the creation of an anonymous inner class from the interface AnonymousInner below
        AnonymousInner obj = new AnonymousInner() {
            @Override
            public void methodOne() {
                System.out.println("methodOne");
            }

            @Override
            public int methodTwo(int a) {
                return a;
            }
        };

        // Step 2) Demonstrate calling both methods using the object you created (by creating an anonymous inner class)

        obj.methodOne();
        int a  = obj.methodTwo(8);
        System.out.println("a = " + a);

    }
}
interface AnonymousInner {
    public void methodOne();
    public int methodTwo(int a);
}
