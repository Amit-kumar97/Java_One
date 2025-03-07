package Module_01.Arrays;

/*
    Maximum Sum Subarray
    Given an array arr of size N. The task is to find the sum of the contiguous subarray within a arr with the largest sum.

    Input Format
    First line consists of an integer n
    Second line consists of n spaced integers

    Output Format
    Print the maximum subarray sum present in the array

    Example 1
    Input
    5
    2 3 1 -1 0

    Output
    6

    Explanation
    Maximum subarray sum = 2 + 3 + 1

    Example 2
    Input
    8
    -2 -3 4 -1 -2 1 5 -3

    Output
    7

    Explanation
    Maximum subarray sum = 4-1-2+1+5
 */
import java.util.Scanner;

public class MaxSum_Subarray {
    // Driver Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        sc.close();
        System.out.println(maxSubArraySum(arr));
    }
    // Function Call
    static int maxSubArraySum(int a[]) {
        // your code here
        int currSum = a[0];
        int maxSum = a[0];

        for(int i=1; i<a.length; i++){
            currSum = Math.max(a[i], currSum+a[i]);
            maxSum = Math.max(currSum, maxSum);
        }

        return maxSum;
    }
}
