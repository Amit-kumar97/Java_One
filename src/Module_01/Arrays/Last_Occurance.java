package Module_01.Arrays;

/*
    Last occurrence in unsorted array
    Given an unsorted integer array of size n. Find the last occurrence of a given key.
    The key is always present in the array.

    Input Format
    First line contains two spaced integers representing the array size n and key.

    Next line contains n-spaced integers representing array a.

    Output Format
    Print the last index of the key in the array.

    Example 1
    Input
    7 5
    8 5 1 4 5 3 2

    Output
    4

    Explanation
    According to 0-based indexing, the last occurrence of key 5 is at index 4.

    Example 2
    Input
    7 10
    10 1 5 9 8 3 10

    Output
    6

    Explanation
    According to 0-based indexing, the last occurrence of key 10 is at index 6.
 */
import java.util.Scanner;

public class Last_Occurance {
    public static void findIndex(int key, int[] arr) {
        //Your code goes here
        int idx = -1;

        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]==key){
                idx = i;
                break;
            }
        }
        System.out.println(idx);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, key;
        n = sc.nextInt();
        key = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        findIndex(key, arr);
        sc.close();
    }
}
