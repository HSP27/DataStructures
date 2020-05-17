package DataTypeBehaviourDemo;

import java.util.Arrays;

public class DataTypeBehaviourDemo {
    public static void main(String args[])
    {
        System.out.println("PRIMITIVE DATA TYPES\n");

        int x = 100;
        int y = x;
        System.out.print("Initially: ");
        System.out.println("x = " + x
                + ", y = " + y);

        y = 30;

        System.out.print("After changing y to 30: ");
        System.out.println("x = " + x
                + ", y = " + y);
        System.out.println(
                "**Only value of y is affected here**\n ");

        System.out.println("REFERENCE DATA TYPES\n");
        int[] arr1 = { 10, 20, 30, 40 };

        // Here complete reference of arr1 is copied to arr2
        int[] arr2 = arr1;

        System.out.println("Initially");
        System.out.println("Array arr1: "
                + Arrays.toString(arr1));
        System.out.println("Array arr2: "
                + Arrays.toString(arr2));

        // Modifying the value at
        // index 1 to 50 in array arr2
        System.out.println("\nModifying the value at "
                + "index 1 to 50 in array arr2\n");
        arr2[1] = 50;

        System.out.println("After modification");
        System.out.println("Array arr1: "
                + Arrays.toString(arr1));
        System.out.println("Array arr2: "
                + Arrays.toString(arr2));
        System.out.println(
                "**Here value of arr1[1] is also affected ");

    }



}
