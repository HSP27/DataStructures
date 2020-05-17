package com.bigoofone;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

public class BalancedBrackets {

    // Complete the isBalanced function below.
    static String isBalanced(String s) {

        int len= s.length();
        Stack2 stack = new Stack2(len);
        System.out.println(s);
        for(int i = 0 ; i< len ;i++){

            char brac = s.charAt(i);

            if(brac == '(' || brac == '{' || brac == '['){

                stack.push(brac);
            }
            if(brac == ')' || brac == '}' || brac == ']'){

                if (stack.isEmpty()){
                    return "NO"  ;
                }
                if(!isMatching(brac , stack.pop())){
                    return "NO";
                }

            }
        }

        if(stack.isEmpty()){
            return "YES";

        }
        else{
            return "NO";
        }
    }

    static boolean isMatching(char ending, char popped){
        System.out.println("ending  " + ending + "popped " + popped);
        if(popped == '(' && ending == ')' ||
                popped == '{' && ending == '}' ||
                popped == '[' && ending == ']'){
            return true;
        }
        else{
            return false;
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {




            String result = isBalanced("{[()]}");
            System.out.println(result);

        scanner.close();
    }
}

class Stack2{
    char ch;
    int top;
    int capacity;
    char a[]= new char[capacity];;

    Stack2 (int capacity){
        this.capacity = capacity;
        top = -1;
        a = new char[capacity];
    }
    void push(char ch){
        if(top < (capacity-1)){
            System.out.println("Capacity "  + capacity + "top " + top + "size " + a.length);
            a[++top]= ch;
        }
        else {
            throw new IllegalArgumentException("Stack Overflow");
        }
    }// end add
    char pop(){
        if(top < 0){
            throw new IllegalArgumentException("Stack UNdrflow");
        }
        else{
            return a[top--] ;

        }
    }//end pop

    boolean isEmpty(){
        return top < 0;
    }


}
