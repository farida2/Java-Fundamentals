package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here
        double radius = 3.14 , height = 5;
        double volume = 3.1416 * radius * radius * height;
        double area =  2 * 3.1416 * radius * (height + radius);
        System.out.println("the volume of the cylinder is "+ volume + " and the area  is " + area );



    }
}