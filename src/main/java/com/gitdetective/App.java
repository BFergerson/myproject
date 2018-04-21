package com.gitdetective;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
    public static void internalCall() {
        MyClass yay = new MyClass();
        yay.myMethod();
    }

}
