package Module_01.Arrays;

/*
    Array Adding
    You have given a number n1, representing the size of array arr1. You have given n1 numbers, representing elements of array arr1. You have given a number n2, representing the size of array arr2.You have given n2 numbers, representing elements of array arr2. The two arrays represent the digits of two numbers.
    You are required to add the numbers represented by two arrays and return the resultant arrays. n1 and n2 are of diferent size

    Input Format
    First line consists of an integer n1
    Second line consists of n1 spaced integers, representing elements of arr1
    Third line consists of an integer n2
    Fourth line consists of n2 spaced integers, representing elements of arr2

    Output Format
    Add the two numbers and return the resultant array

    Example 1
    Input
    3
    1 2 3
    3
    3 2 1

    Output
    4
    4
    4

    Explanation
    Adding corresponding elements gives 4 at each index -> 1 + 3 = 2 + 2 = 3 + 1 = 4

    Example 2
    Input
    2
    2 1
    4
    1 2 3 4

    Output
    1
    2
    5
    5

    Explanation
    1234 + 21 = 1255
 */
import java.util.Scanner;

public class Array_Adding {
    static int[] calSum(int a[], int b[], int n, int m) {
        // your code here
        int[] arr = new int[Math.max(n, m)];

        int i = n-1;
        int j = m-1;
        int k = arr.length-1;
        int carry = 0;

        while(k>=0){
            int digit = carry;

            if(i>=0) digit += a[i--];

            if(j>=0) digit += b[j--];

            arr[k--] = digit%10;

            carry = digit/10;
        }
        if(carry==0)
            return arr;
        else{
            int[] res = new int[arr.length+1];
            res[0] = carry;

            for(int idx=0; idx<arr.length; idx++){
                res[idx+1] = arr[idx];
            }
            return res;
        }
    }

    /* Driver program to test above function */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();
        sc.close();

        int[] res = calSum(arr1, arr2, n1, n2);
        for (int i : res) System.out.println(i);
    }
}
