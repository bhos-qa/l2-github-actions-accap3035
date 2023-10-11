package org.example;

public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return (a>b)?(a-b):(b-a);
    }

    public int mul(int a, int b){
        return a*b;
    }
    public int divide(int a, int b){
        return a/b;
    }
    public int remainder(int a, int b) {
        return (a>b)?a%b:b%a;
    }
}
