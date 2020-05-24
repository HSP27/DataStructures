package com.bigoofone.Arrays;

import java.util.Arrays;

public class ArrayLeftRotation {

    public static void main(String[] args) {

        //d denotes the number of times to left rotate the array
        int d = 4;
        //input array we want to rotate
        int[] a = {1 ,2 ,3 ,4 ,5};
        //array after left rotating array a
        int[] b = new int[a.length];
        int index;

        //this for loop finds the index of the ith element after d left rotations
        //index denotes the index of ith element after d left rotations
        for (int i = 0; i < a.length; i++) {
            int number = i - d;
            if (number < 0) {
                index = a.length + number;
            } else {
                index = number;
            }
            b[index] = a[i];
        }

        //Print the left rotated array
        System.out.print("Array Before Rotation\n" + Arrays.toString(a) + "\n");
        System.out.print("Array After Left Rotation " + d + " Times\n" +Arrays.toString(b));
    }
}


