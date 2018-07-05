package com.gitdetective;

/**
 * Hello world!
 */
public class App {
    
    private static final int test = doThing(4);

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("hi2");
        System.out.println(doThing(2));
    }
    
    public static void internalCall1() {
        System.out.println("hi2");
        MyClass yay = new MyClass();
        yay.myMethod();
        System.out.println(doThing(2));
    }
    
    public static void internalCall2() {
        System.out.println("hi2");
        MyClass yay = new MyClass();
        yay.myMethod2();
        System.out.println(doThing(2));
    }
    
    public static void internalCall3() {
        System.out.println("hi2");
        MyClass yay = new MyClass();
        yay.myMethod2();
        System.out.println(doThing(2));
    }
    
    public static void internalCall4() {
        System.out.println("hi2");
        MyClass yay = new MyClass();
        yay.myMethod2();
        System.out.println(doThing(2));
    }
    
    public static void internalCall5() {
        System.out.println("hi2");
        MyClass yay = new MyClass();
        yay.myMethod2();
        System.out.println(doThing(2));
    }

    private static int doThing(int x) {
        return x * x;
    }

}
