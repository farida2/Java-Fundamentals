package labs_examples.objects_classes_methods.labs.methods;
// Created by Farida-Belhous 04/17/2020
/*
    1) Demonstrate method overloading in this class

    2) Demonstrate the difference between "pass by value" and "pass by reference"

    3) Create a method that will return the largest of 4 numbers (all of which are passed in as arguments)

    4) Write a method to count all consonants (the opposite of vowels) in a String

    5) Write a method that will print some kind of ascii art to the console (Google "ascii art" if needed)

    6) Write a method that will determine whether or not a number is prime

    7) Write a method that will return a small array containing the highest and lowest numbers in a given numeric array,
            which is passed in as an argument

    8) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
        In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
        divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the
        length of the returned list


    9) Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot
        instantiate a second array. You must reverse the array in place using only one extra temp variable. Hint: this
        variable is used to temporarily store individual values in the array
 */


public class MethodTraining {
    public static void main(String[] args) {
        //1) Demonstrate method overloading in this class
        System.out.println("addition(2, 5) is "+ addition(2,5));
        System.out.println("addition(4,6,8) is " + addition(4,6,8));

        System.out.println("----------------------------------");
       // 2) Demonstrate the difference between "pass by value" and "pass by reference"
        // Here is passing by value - primitive data type passed by value
        System.out.println("addition(4, 7) is "+ addition(4,7));
        // Here is passing by reference --object dada type passed by reference??????

        System.out.println("----------------------------------");
       // 3) Create a method that will return the largest of 4 numbers (all of which are passed in as arguments)
        System.out.println("The largest number of Four is " + largestOfFour(7, 2, 10, 9));

        System.out.println("----------------------------------");
        //4) Write a method to count all consonants (the opposite of vowels) in a String
        System.out.println("The number of consonant in codingnomads is  " + countConsonants("codingnomads"));
        System.out.println("----------------------------------");


        //5) Write a method that will print some kind of ascii art to the console (Google "ascii art" if needed)
        printATree();

    }



    //1) Demonstrate method overloading in this class
    static int addition(int a, int b){
       return a + b;
    }
    static int addition(int a, int b, int c){
        return a + b + c;
    }
    // 3) Create a method that will return the largest of 4 numbers (all of which are passed in as arguments)
    static int largestOfFour(int a, int b, int c, int d){
        int max = 0;

        if(a > b && a > c && a > d){
            max = a;
        }
        else if(b > c && b > d){
            max = b;
        }
        else if( c > d){
            max = c;
        }
        else{
            max = d;
        }

        return max;
    }


     //4) Write a method to count all consonants (the opposite of vowels) in a String
     static int countConsonants(String string){
        int count = 0;
        String consonants = "aeiou";
        for (int i = 0; i < string.length(); i++){
            for(int j = 0; j < consonants.length(); j++){
                if(string.charAt(i) == consonants.charAt(j)){
                    count++;
                }
            }
        }


        return count;

     }

     //5) Write a method that will print some kind of ascii art to the console (Google "ascii art" if needed)
      static void printATree(){
          System.out.println("     ^  ");
          System.out.println("    ---  ");
          System.out.println("   -----");
          System.out.println("  -------  ");
          System.out.println(" ---------");
          System.out.println("-----------");
          System.out.println("    ---  ");
          System.out.println("    ---  ");
          System.out.println("    ---  ");
      }




}







