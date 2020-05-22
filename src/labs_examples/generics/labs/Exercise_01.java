package labs_examples.generics.labs;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 *
 */
class TwoInstanceVarGen<T, V>{
    T var1;
    V var2;

    public TwoInstanceVarGen(T var1, V var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    public T getVar1() {
        return var1;
    }

    public void setVar1(T var1) {
        this.var1 = var1;
    }

    public V getVar2() {
        return var2;
    }

    public void setVar2(V var2) {
        this.var2 = var2;
    }
}
/*
 * Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 *
 */

class TwoInstanceVarGenDemo{
    public static void main(String[] args) {
        TwoInstanceVarGen<String, Integer> obj = new TwoInstanceVarGen("Year", 2020);
        String v1 = obj.getVar1();
        Integer v2 = obj.getVar2();
        System.out.println(v1 +":" + v2);

    }
}

