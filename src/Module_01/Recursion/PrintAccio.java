package Module_01.Recursion;

/*
    Print ACCIOJOB
    Using recursion, your task is to print string ACCIOJOB, n times.

    Input Format
    First line contains integer n

    Output Format
    Print the string ACCIOJOB, n times.

    Example 1
    Input
    3

    Output
    ACCIOJOB
    ACCIOJOB
    ACCIOJOB

    Explanation:
    As the value of n is 3 so, we get 3 times ACCIOJOB.

    Example 2
    Input
    1

    Output
    ACCIOJOB

    Explanation:
    As the value of n is 1, so we get ACCIOJOB 1 times.
 */
import java.io.IOException;
import java.util.Scanner;

public class PrintAccio {
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        solve(n);
    }

    public static void solve(int n) {
        // Your code here
        if(n==0)
            return;

        System.out.println("ACCIOJOB");
        solve(n-1);
    }
}
