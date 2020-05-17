package com.bigoofone;

public class PrintElementAsNumber {
    public static void main(String[] args) {
        System.out.println(Number.func('A'));
    }
}

class Number {
    static int func(int n) {
        return n;
    }

    static int func(char a) {
        return a;
    }
}
