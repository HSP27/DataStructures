package com.bigoofone;

public class HourGlassArray {

    public static void main(String[] args) {

        int[][] arr = {{-1, -1, 0, -9, -2, -2},
                {-2, -1, -6, -8, -2, -5},
                {-1, -1, -1, -2, -3, -4},
                {-1, -9, -2, -4, -4, -5},
                {-7, -3, -3, -2, -9, -9},
                {-1, -3, -1, -2, -4, -5}};

        int result = hourglassSum(arr);
        System.out.println(result);
    }

    static int hourglassSum(int[][] arr) {
        int sum = 0, thissum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                thissum = getSum(i, j, arr) + arr[i + 1][j + 1] + getSum(i + 2, j, arr);
                if (i == 0 && j == 0) {
                    sum = thissum;
                }
                System.out.print(thissum + " ");
                if (thissum > sum) {
                    sum = thissum;
                }
            }

        }
        return sum;
    }


    private static int getSum(int i, int j, int[][] arr) {
        int top = 0;
        for (int k = j; k < j + 3; k++) {
            top = top + arr[i][k];
        }
        return top;
    }

}

