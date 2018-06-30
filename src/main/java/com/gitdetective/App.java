package com.gitdetective;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("hi");
    }
    
    public static void internalCall1() {
        System.out.println("hi");
        MyClass yay = new MyClass();
        yay.myMethod();
    }
    
    public static void internalCall2() {
        System.out.println("hi");
        MyClass yay = new MyClass();
        yay.myMethod2();
    }
    
    public static void internalCall3() {
        System.out.println("hi");
        MyClass yay = new MyClass();
        yay.myMethod2();
    }
    
    public static void internalCall4() {
        System.out.println("hi");
        MyClass yay = new MyClass();
        yay.myMethod2();
    }
    
    public static void internalCall5() {
        System.out.println("hi");
        MyClass yay = new MyClass();
        yay.myMethod2();
    }

}
