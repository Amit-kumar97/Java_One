package Module_01.Functions;

/*
    Function Problem 2
    Write a program in which user will enter two positive integers and those two integers will be passed to another function fun.
    The fun function will perform the addition of the two and will print the output.
    Note that, output will be printed inside fun function.

    Input Format
    First line contains two integers n and m.

    Output Format
    Print the sum of two integers.

    Example 1
    Input
    2 3

    Output
    5
    Explanation sum of two numbers is printed which for 2 and 3 is 5

    Example 2
    Input
    1 4

    Output
    5
    Explanation sum of two numbers is printed which for 1 and 4 is 5
 */
import java.util.Scanner;

public class Problem_02 {
    public static void fun(int n, int m) {
        // write code here
        int sum = n+m;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        fun(n, m);
    }
}
