package Module_01.Loops;

/*
    Odd Sum
    You are given a number N .

    Print sum of all odd numbers from 1 to N (inclusive).

    Input Format
    single line consisting of an integer N.

    Output Format
    Print the odd Sum.

    Example 1
    Input
    10

    Output
    25

    Explanation
    Sum : 1 + 3 + 5 + 7 + 9 = 25

    Example 2
    Input
    4

    Output
    4

    Explanation
    sum : 1 + 3 = 4
 */
import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long sumOfOdd = 0;
        for(int i=1; i<=n; i++){
            if(i%2!=0)
                sumOfOdd += i;
        }
        System.out.println(sumOfOdd);
    }
}
