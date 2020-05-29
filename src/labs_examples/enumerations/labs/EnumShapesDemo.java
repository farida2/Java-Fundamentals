package labs_examples.enumerations.labs;


public class EnumShapesDemo {
    // shape is an enum
    Shapes shape;

    // constructor with one parameter
    public EnumShapesDemo(Shapes shape) {
        this.shape = shape;
    }

    // A getter
    public Shapes getShape() {
        return shape;
    }

    // A setter
    public void setShape(Shapes shape) {
        this.shape = shape;
    }

    // Select the shape to know if it has angles/and how many  or not
    public void selectAShape(){
        switch (shape) {

            case Square:
                System.out.println("A Square, it has four right-angles");
                break;

            case Triangle:
                System.out.println("A Triangle, it has three angles , it may have one right-angle");
                break;

            case Rectangle:
                System.out.println("A Rectangle, it has four right-angles");
                break;

            default:
                System.out.println("A circle , it has no angles ");
                break;

        }
    }


    public static void main(String[] args) {
        EnumShapesDemo sh = new EnumShapesDemo(Shapes.Square);

        for(Shapes item: Shapes.values() ) {
            if (item == sh.getShape()) {
                sh.selectAShape();
            }
        }
    }
}
