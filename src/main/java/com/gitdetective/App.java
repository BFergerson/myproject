package com.gitdetective;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
    public static void internalCall1() {
        MyClass yay = new MyClass();
        yay.myMethod();
    }
    
    public static void internalCall2() {
        MyClass yay = new MyClass();
        yay.myMethod2();
    }
    
    public static void internalCall3() {
        MyClass yay = new MyClass();
        yay.myMethod2();
    }
    
    public static void internalCall4() {
        MyClass yay = new MyClass();
        yay.myMethod2();
    }
    
    public static void internalCall5() {
        MyClass yay = new MyClass();
        yay.myMethod2();
    }

}
