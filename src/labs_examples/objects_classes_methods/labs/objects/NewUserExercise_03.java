package labs_examples.objects_classes_methods.labs.objects;

// Created by Farida-Belhous-04/17/2020
/*
For this exercise please create two classes. The first class is the controller and it will contain the main() method.
The second class is a POJO. Just a simple object type class that defines an object. In this POJO, demonstrate
at least three overloaded constructors. In the main() method, create at least 3 objects of your POJO class, each using
a different constructor.
*/
public class NewUserExercise_03 {
    public static void main(String[] args) {
        Senior John = new Senior("Smith");
        Senior Ester = new Senior(4563);
        Senior Mike = new Senior(true);
        System.out.println("Mike's activity= " + Mike.activity);
        System.out.println("Ester's ID = " + Ester.ID);
        System.out.println("John's last name = " + John.lastName);

    }
}

class Senior{

    String lastName;
    int ID;
    boolean activity;

    public Senior(String lastName) {
        this.lastName = lastName;
    }

    public Senior(int ID) {
        this.ID = ID;
    }

    public Senior(boolean activity){
        this.activity = activity;
    }


}
