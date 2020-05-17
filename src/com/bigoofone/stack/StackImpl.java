package com.bigoofone.stack;

import java.util.*;

/**
 * Stack implementation where function to get max element of stack is also provided
 * input 1 mean push
 * 2 means pop
 * 3 means print max element
 */
public class StackImpl {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Stack stack = new Stack (n);
        for(int i=0; i< n; i++){
            int input= scan.nextInt();

            if(input==1){
                int add_new = scan.nextInt();
                stack.add(add_new);
            }

            else if(input ==2){
                stack.pop();
            }

            else if(input==3){
                stack.printMax();
            }

        }//end for

    }//end main
}

class Stack{

    StackElement stackElement;
    int top;
    int capacity;
    StackElement a[] = new StackElement[capacity];

    Stack (int capacity){
        this.capacity = capacity;
        top = -1;
        a= new StackElement[capacity];

    }
    void add(int number){
        if(top < (capacity-1)){
            int max;
            if(top<0){
                max= number;
            } else{
                StackElement currentTop = a[top];
                int currentMax = currentTop.max;
                max = currentMax > number ? currentMax : number;
            }
            a[++top] = new StackElement(number, max);
        }
        else {
            throw new IllegalArgumentException("Stack Overflow");
        }

    }// end add

    void pop(){
        if(top < 0){
            throw new IllegalArgumentException("Stack UNdrflow");
        }
        else{
            StackElement topEl= a[top--];

        }
    }//end pop

    void printMax(){
        StackElement topElement= a[top];
        System.out.println(topElement.max);
    }
}

class StackElement{
    int number;
    int max;

    StackElement(int number,int  max){
        this.number = number;
        this.max= max ;
    }
}

    //Sample test cases
   /* Input (stdin)
Download
        10
        1 97
        2
        1 20
        2
        1 26
        1 20
        2
        3
        1 91
        3
        Expected Output
        Download
        26
        91
*/
