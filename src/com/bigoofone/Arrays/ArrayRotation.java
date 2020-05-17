package com.bigoofone.Arrays;

import java.util.Scanner;

public class ArrayRotation {


    public static void main(String[] args) {


        int n = 5;

        int d = 4;

        int[] a = {1 ,2 ,3 ,4 ,5};
        int[] b = new int[n];
        int index;

        for (int i = 0; i < a.length; i++) {
            int number = i - d;
            if (number < 0) {
                index = n + number;
            } else {
                index = number;
            }
            b[index] = a[i];
        }


        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }

    }
}

