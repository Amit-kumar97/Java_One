package Module_01.Sorting;

/*
    Maximum occurrence
    You are given an array arr of length n. Your task is to print the element which has maximum occurrences in the array. If two elements have the same occurrence then print the smaller element

    Input Format
    The first line of input contains an integer n, size of the array.

    The next line contains n space seperated integers denoting the elements of the array.

    Output Format
    Print single integer denoting the maximum occurring element in the array.

    Example 1
    Input
    8
    7 7 6 4 8 7 3 1

    Output
    7

    Explanation
    We have arr = [7 7 6 4 8 7 3 1]
    As 7 is occurring 3

    Example 2
    Input
    7
    9 8 1 1 2 2 3

    Output
    1

    Explanation
    1 and 2 have same occurrence that is 2 so print smaller element i.e. 1.
 */
import java.util.Arrays;
import java.util.Scanner;

public class MaximumOccurrence {
    static int maximum_occurrence(int arr[], int n) {
        //Write code here
        Arrays.sort(arr);
        int max = Integer.MIN_VALUE;
        int maxNum = arr[0];

        int count = 1;
        int num = arr[0];
        for(int i=1; i<n; i++){
            if(num==arr[i])
                count++;
            else{
                if(count>max){
                    max = count;
                    maxNum = num;
                }
                num = arr[i];
                count = 1;
            }
        }
        return maxNum;
    }
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(maximum_occurrence(arr, n));

    }
}
