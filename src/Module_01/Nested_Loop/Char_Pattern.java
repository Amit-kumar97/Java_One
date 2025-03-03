package Module_01.Nested_Loop;

/*
    Print Character Pattern
    You are given a number N. Print a pattern consisting of N rows, where the first row has 1 A, the second row has 2 Bs, and so on for N letters. Check the examples for a better understanding.

    Input Format
    First line of input contains N, the number of rows for the pattern

    Output Format
    You need to print the pattern.

    Example 1
    Input
    4

    Output:
    A
    BC
    CDE
    DEFG

    Explanation:
    For number of rows to be 4 we get this output.

    Example 2
    Input
    5

    Output:
    A
    BC
    CDE
    DEFG
    EFGHI

    Explanation:
    For number of rows to be 5 we get this output.
 */
import java.util.Scanner;

public class Char_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Write your code here

        for(int i=0; i<n; i++){
            char ch = (char)('A'+i);
            for(int j=0; j<i+1; j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
