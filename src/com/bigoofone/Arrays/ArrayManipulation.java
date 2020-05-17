package com.bigoofone.Arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulation {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = 0;
        }

        for(int i=0; i<queries.length;i++){

         for(int j=queries[i][0]-1 ; j<=queries[i][1]-1; j++){
             arr[j]= arr[j]+queries[i][2];
         }

        }

        //getMax()
        int max=0;
        for(int i =0 ;i<n ;i++){
            if(arr[i]> max){
                max= arr[i];
            }

        }

        System.out.println(max);
        return max;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = 10;

        int m = 3;

        int[][] queries= {{1, 2, 100},
                { 2 ,5 ,100},
                {3, 4, 100}};

       /* for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }*/



        long result = arrayManipulation(n, queries);

        scanner.close();
    }
}

