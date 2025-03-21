package Module_01.Arrays;

/*
    Rotate array
    Given an array with N elements, the task is to rotate the array to the right by K steps.
    Note : if K is negative , rotate the array to the left.

    Input Format
    The first line contains an integer N representing the size of the array.
    The second line contains N space-separated integers representing the elements of the array.
    The last line contains an integer K representing the number of times the array has to be rotated in the right direction if k is positive , otherwise to the left if k is negative.

    Output Format
    The only line of the output prints N space-separated integers representing the Rotated array elements.

    Example 1
    Input
    8
    7 5 2 11 2 43 1 1
    2

    Output
    1 1 7 5 2 11 2 43

    Explanation
    Rotate 1 steps to the right : 1 7 5 2 11 2 43 1
    Rotate 2 steps to the right : 1 1 7 5 2 11 2 43

    Example 2
    Input
    8
    7 5 2 11 2 43 1 1
    3

    Output
    43 1 1 7 5 2 11 2

    Explanation
    Rotate 1 steps to the right : 1 7 5 2 11 2 43 1
    Rotate 2 steps to the right : 1 1 7 5 2 11 2 43
    Rotate 3 steps to the right : 43 1 1 7 5 2 11 2
 */
import java.util.Scanner;

public class RotateArray {
    public static void rotateArray(int[] nums, int k) {
        // write your code here
        int n = nums.length;
        k = k%n;
        for(int i=0; i<n-k; i++){
            for(int j=0; j<n-1; j++){
                int temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();
        rotateArray(arr, k);

        for(int num : arr){
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
