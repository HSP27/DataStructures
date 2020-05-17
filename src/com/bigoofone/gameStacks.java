package com.bigoofone;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
        import java.math.*;
        import java.text.*;
        import java.util.*;
        import java.util.regex.*;

public class gameStacks {

    /*
     * Complete the twoStacks function below.
     */
    static int twoStacks(int x, int[] a, int[] b) {
        /*
         * Write your code here.
         */

        int maxSize = a.length;
        int minSize = b.length;
        int possibleSum = 0;
        int totalNos =0;
        int topA= -1;
        int topB= -1;

        while(topA < maxSize -1 || topB < minSize-1){
            System.out.println("llllllllllll");
            if(topA < maxSize -1 && topB < minSize -1){
                System.out.println(a[topA + 1] +"  "+ b[topB + 1] );
                if(a[topA + 1] >= b[topB + 1]){
                    int sum = possibleSum + b[topB + 1];
                    if(sum > x){
                        System.out.println(sum);
                        return totalNos;
                    }
                    System.out.println("a n b __ b+1 : " + totalNos);
                    ++totalNos;
                    possibleSum = possibleSum + b[++topB];

                }
                else{
                    int sum = possibleSum + a[topA + 1];
                    if(sum > x){
                        System.out.println(sum);
                        return totalNos;
                    }
                    System.out.println("a n b __ a+1 : "+ totalNos);
                    ++totalNos;
                    possibleSum = possibleSum + a[++topA];


                }

            }
            else if(topA < maxSize-1 ){
                int sum = possibleSum + a[topA + 1];
                if(sum > x){
                    System.out.println(sum);
                    return totalNos;
                }
                System.out.println("a : " + totalNos);
                ++totalNos;
                possibleSum = possibleSum + a[++topA];
            }

            else  if( topB < minSize-1){
                System.out.println("b : " + totalNos);
                int sum = possibleSum + b[topB + 1];
                if(sum > x){
                    System.out.println(sum);
                    return totalNos;
                }
                ++totalNos;
                possibleSum = possibleSum + b[++topB];
            }


        }


        return totalNos;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\admin\\Documents\\m"));

        int g = 1;

        for (int gItr = 0; gItr < g; gItr++) {


            int n = 17;

            int m = 26;

            int x = 60;

            int[] a = {17 ,5 ,0};

            int[] b = {10 ,8 ,2 ,1 ,13, 1, 14, 18, 9 ,18, 16, 19, 5};

            int result = twoStacks(x, a, b);

            System.out.println(result);
        }


    }
}
