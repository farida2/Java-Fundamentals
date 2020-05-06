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


import java.util.ArrayList;

public class MethodTraining {
    public static void main(String[] args) {
//        //1) Demonstrate method overloading in this class
//        System.out.println("addition(2, 5) is "+ addition(2,5));
//        System.out.println("addition(4,6,8) is " + addition(4,6,8));
//
//        System.out.println("----------------------------------");
//       // 2) Demonstrate the difference between "pass by value" and "pass by reference"
//        // Here is passing by value - primitive data type passed by value
//        System.out.println("addition(4, 7) is "+ addition(4,7));
//        // Here is passing by reference --object dada type passed by reference??????
//
//        System.out.println("----------------------------------");
//       // 3) Create a method that will return the largest of 4 numbers (all of which are passed in as arguments)
//        System.out.println("The largest number of Four is " + largestOfFour(7, 2, 10, 9));
//
//        System.out.println("----------------------------------");
//        //4) Write a method to count all consonants (the opposite of vowels) in a String
//        System.out.println("The number of consonant in codingnomads is  " + countConsonants("codingnomads"));
//        System.out.println("----------------------------------");
//
//
//        //5) Write a method that will print some kind of ascii art to the console (Google "ascii art" if needed)
//        printATree();
//
//        System.out.println("----------------------------------");
//
//        //6) Write a method that will determine whether or not a number is prime
//        isPrime(13);
//        isPrime(90);
//        isPrime(57);
//        isPrime(35);
//        isPrime(47);
//        System.out.println("----------------------------------");


        // 7) Write a method that will return a small array containing the highest and lowest numbers in a given numeric array,
        // which is passed in as an argument

        int[] newArr = {0,17,44,9,31,5};
       // highestLowestNumber(newArr);
        int[] anArr = highestLowestNumber(newArr);
        System.out.print("anArr = ");
        for(int i = 0; i < anArr.length; i++){
            System.out.print(anArr[i] + " ");
        }
        System.out.println("----------------------------------");


       /* 8) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
          In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
          divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the
          length of the returned list

        */
       // myMethod(30, 2,6);


        System.out.println("----------------------------------");

     /*
       9) Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot
        instantiate a second array. You must reverse the array in place using only one extra temp variable. Hint: this
        variable is used to temporarily store individual values in the array
      */

//        int[] arr = {1,2,3,4,5};
//
//        reverseArr(arr);


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

     // 6) Write a method that will determine whether or not a number is prime

    static void isPrime(int number) {

          if(number % 2 == 0 || number % 3 == 0 || number % 5 == 0){
              System.out.println(number + " is not prime number");
          }
          else{
              System.out.println(number + " is a prime number");
          }


    }

    //7) Write a method that will return a small array containing the highest and lowest numbers in a given numeric array,
    //   which is passed in as an argument

    static int[] highestLowestNumber(int[] arr){
          int[] myArr = new int[2];
          int highest = arr[0];
          int lowest = arr[0] ;

          for( int i = 0 ; i < arr.length; i++){
              if(arr[i] > highest){
                 highest = arr[i];
              }
              else if(arr[i] < lowest){
                  lowest = arr[i];
              }
          }

          myArr[0] = lowest;
          myArr[1] = highest;
          return myArr;
    }

    /*
       8) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
        In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
        divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the
        length of the returned list

     */

        static void myMethod(int maxNum, int divisor1, int divisor2) {
            ArrayList<Integer> list = new ArrayList<Integer>();

            //populate list and check if the element is divisible by both divisor1 and divisor2
            for (int i = 0; i < maxNum ; i++) {

                if(i  % divisor1 == 0 && i  % divisor2 == 0){
                    list.add(i);
                }
            }

            System.out.println(list.size());

        }

        /*
         9) Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot
         instantiate a second array. You must reverse the array in place using only one extra temp variable. Hint: this
         variable is used to temporarily store individual values in the array

         */

          static void reverseArr(int[] arr){
              int temp = 0;
              for(int i = 0; i < arr.length/2; i ++){
                  temp = arr[i];
                  arr[i] = arr[arr.length - i - 1];
                  arr[arr.length - i - 1] = temp;
              }
              for(int num: arr){
                  System.out.print(num + " ");
              }
          }

}







