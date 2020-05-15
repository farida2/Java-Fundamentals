package labs_examples.packages.labs;

/**
 * Packages Exercise 1: Protected modifier
 *
 *      1) Within this package, create two new labs_examples.packages.
 *      package1 and package2
 *
 *      2) Create a new Java class in each package.
 *      in package1 : Myclass1.java
 *      in package2 : Myclass2.java
 *
 *      3) Create at least two methods in each class, with at least one with the protected access modifier
 *      in Myclass1 : I have two methods :
 *      private int  multiply(int a, int b){return a * b; }
 *      public double divide(int a, int b) {return a/b; }
 *
 *      in Myclass2 : I have two methods :
 *      protected int add(int a, int b) {return a + b;}
 *      int subtract(int a, int b) {return a - b;}
 *
 *      4) Demonstrate how the the protected access modifier restricts access from package to package
 *        I cannot call Myclass2 methods add(..) and subtract(..) form package1 because
 *       add(..) is protected (can be used within the package2 only)
 *       and subtract (..) is default the same as protected
 *
 */
