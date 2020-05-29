package labs_examples.enumerations.labs;

import java.util.Scanner;

public class PrimaryColorsDemo {
    public static void main(String[] args) {

        // Using Scanner ,  ask the user to enter a color1
        System.out.println("Enter your color 1 : ");
        Scanner inputColor = new Scanner(System.in);
        PrimaryColors color1 = PrimaryColors.valueOf(inputColor.next());
        
        // Using Scanner ,  ask the user to enter a color2
        System.out.println("Enter your color  2: ");
        PrimaryColors color2 = PrimaryColors.valueOf(inputColor.next());


        // checking that if the chosen color is primary color or not
        if ((color1.toString() == "Red"  && color2.toString() == "Blue") || (color2.toString() == "Red"  && color1.toString() == "Blue")){
            System.out.println("Red and Blue gives us Purple ");
        }
        if ((color1.toString() == "Blue" && color2.toString() == "Yellow") || (color2.toString() == "Blue" && color1.toString() == "Yellow") ){
            System.out.println("Blue and Yellow gives us Green ");
        }
        if ((color1.toString() == "Yellow" && color2.toString() == "Red") || (color2.toString() == "Yellow" && color1.toString() == "Red")){
            System.out.println("Yellow and Red gives us Orange ");
        }




    }
}
