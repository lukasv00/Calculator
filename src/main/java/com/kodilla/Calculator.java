package com.kodilla;

public class Calculator {

    private int a;
    private int b;

    private Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum() {
        int sum = a + b;
        return sum;
    }

    public int substraction() {
        int sub = a - b;
        return sub;
    }

    public static void main(String args[]){
        Calculator calculator = new Calculator(1, 15);
        calculator.sum();

        System.out.println(calculator.sum());
}

}