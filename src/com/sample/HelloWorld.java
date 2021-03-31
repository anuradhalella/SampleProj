package com.sample;

public class HelloWorld {
    public static void main(String []argss){
        System.out.println("Hello World");
        HelloWorld hw = new HelloWorld();
        hw.add(2, 3);
        System.out.println("Successful Addition");
    }
    public int add(int a, int b){
        int c = a + b;
        System.out.println("Sum of 2 numbers is===="+c);
        return c;
    }
}
