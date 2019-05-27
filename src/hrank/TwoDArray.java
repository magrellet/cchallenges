package com.company;
/**
 *
 * Objective
 * Today, we're building on our knowledge of Arrays by adding another dimension. Check out the Tutorial tab for learning materials and an instructional video!
 *
 * Context
 * Given a 6x6 2D Array, A:
 *
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * We define an hourglass in A to be a subset of values with indices falling in this pattern in A's graphical representation:
 *
 * a b c
 *   d
 * e f g
 * There are 16 hourglasses in A, and an hourglass sum is the sum of an hourglass' values.
 *
 * Task
 * Calculate the hourglass sum for every hourglass in A, then print the maximum hourglass sum.
 *
 * Input Format
 *
 * There are 6 lines of input, where each line contains 6 space-separated integers describing 2D Array A; every value in A will be in the inclusive range of -9 to 9.
 *
 * Constraints
 * -9<=A[i][j]<=9
 * 0<=Ai, j<=5
 *
 * Output Format
 *
 * Print the largest (maximum) hourglass sum found in A.
 *
 * Sample Input
 *
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 2 4 4 0
 * 0 0 0 2 0 0
 * 0 0 1 2 4 0
 * Sample Output
 *
 * 19
 * Explanation
 *
 * A contains the following hourglasses:
 *
 * 1 1 1   1 1 0   1 0 0   0 0 0
 *   1       0       0       0
 * 1 1 1   1 1 0   1 0 0   0 0 0
 *
 * 0 1 0   1 0 0   0 0 0   0 0 0
 *   1       1       0       0
 * 0 0 2   0 2 4   2 4 4   4 4 0
 *
 * 1 1 1   1 1 0   1 0 0   0 0 0
 *   0       2       4       4
 * 0 0 0   0 0 2   0 2 0   2 0 0
 *
 * 0 0 2   0 2 4   2 4 4   4 4 0
 *   0       0       2       0
 * 0 0 1   0 1 2   1 2 4   2 4 0
 * The hourglass with the maximum sum () is:
 *
 * 2 4 4
 *   2
 * 1 2 4
 *
 *
 */

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        setMatrix(arr);

        int max=-100;

        for(int i =0;i+2<arr.length; i++){
            for(int j =0;j+2<arr.length; j++){

                int a = arr[i][j];
                int b = arr[i][j+1];
                int c = arr[i][j+2];
                int d = arr[i+1][j+1];
                int e = arr[i+2][j];
                int f = arr[i+2][j+1];
                int g = arr[i+2][j+2];
                int currSum=a+b+c+d+e+f+g;
                if(currSum>max){
                    max=currSum;
                }

            }
        }
    System.out.println(max);
    }

    private static void setMatrix(int[][] arr) {
        arr[0][0]=1;
        arr[0][1]=1;
        arr[0][2]=1;
        arr[0][3]=0;
        arr[0][4]=0;
        arr[0][5]=0;

        arr[1][0]=0;
        arr[1][1]=1;
        arr[1][2]=0;
        arr[1][3]=0;
        arr[1][4]=0;
        arr[1][5]=0;

        arr[2][0]=1;
        arr[2][1]=1;
        arr[2][2]=1;
        arr[2][3]=0;
        arr[2][4]=0;
        arr[2][5]=0;

        arr[3][0]=0;
        arr[3][1]=0;
        arr[3][2]=2;
        arr[3][3]=4;
        arr[3][4]=4;
        arr[3][5]=0;

        arr[4][0]=0;
        arr[4][1]=0;
        arr[4][2]=0;
        arr[4][3]=2;
        arr[4][4]=0;
        arr[4][5]=0;

        arr[5][0]=0;
        arr[5][1]=0;
        arr[5][2]=1;
        arr[5][3]=2;
        arr[5][4]=4;
        arr[5][5]=0;
    }
}
