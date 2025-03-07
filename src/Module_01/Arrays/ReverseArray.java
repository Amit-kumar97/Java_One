package Module_01.Arrays;

/*
    Reverse an array
    You are given an array arr of length n. You have to come up with an in-place solution.

    Input Format
    The first line of input contains an integer n, size of the array.
    The next line contains n space-separated integers denoting the elements of the array.

    Output Format
    Printing is handled by the main function you just have to come up with an inplace solution.

    Example 1:
    Input
    4
    1 3 5 7

    Output
    7 5 3 1

    Explanation
    We have array = [1 3 5 7].
    Print the array from the ending. The reversed array is [7 5 3 1]

    Example 2:
    Input
    7
    0 0 1 1 0 2 3

    Output
    3 2 0 1 1 0 0
 */
import java.util.Scanner;

public class ReverseArray {
    public static void reverseArray(int arr[])
    {
        //Write code here
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();

        reverseArray(arr1);

        for (int i = 0; i < n; i++)
            System.out.print(arr1[i] + " ");
        System.out.println('\n');
    }
}
