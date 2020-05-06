package labs_examples.static_nonstatic.labs;

public class FrogMain {
    public static void main(String[] args) {
        // create at least 3 distinct frogs below
        Frogs frog1 = new Frogs("name1","habita1");
        Frogs frog2 = new Frogs("name2","habita2");
        Frogs frog3 = new Frogs("name3","habita3");

        // once all are created, call the toString() on each
        System.out.println(frog1.toString());
        System.out.println(frog2.toString());
        System.out.println(frog3.toString());


        // what printed for numFrogs? why?

        /*
        numFrogs = 3 , because that variable is created static for the class Frogs its self , to count the numbers of the frogs created
        each frog (object) created  will not take a copy of that static instance variable
         */

    }


}
    class Frogs {
        String name;
        String habitat;
        static int numFrogs;

        public Frogs(String name, String habitat){
            this.name = name;
            this.habitat = habitat;
            numFrogs++;
        }

        @Override
        public String toString() {
            return "Frog{" +
                    "name='" + name + '\'' +
                    ", habitat='" + habitat + '\'' +
                    ", numFrogs= " + numFrogs + '\'' +
                    '}';

        }
    }

