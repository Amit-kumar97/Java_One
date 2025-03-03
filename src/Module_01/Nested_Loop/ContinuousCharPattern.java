package Module_01.Nested_Loop;

/*
    Print Continuous Character Pattern
    Given an integer n that denotes the number of rows to be printed, print the pattern in which each row starts with its corresponding alphabet and has a length equal to the row number. (See the examples for a better understanding).

    Note: You can take the alphabet to be cyclic. On reaching Z, you will cycle back to A, then B, and so on.

    Input Format
    First line contains the value n representing the number of rows.

    Output Format
    Print the pattern.

    Example 1
    Input
    5

    Output
    A
    BC
    CDE
    DEFG
    EFGHI

    Example 2
    Input
    8

    Output
    A
    BC
    CDE
    DEFG
    EFGHI
    FGHIJK
    GHIJKLM
    HIJKLMNO
 */
import java.util.Scanner;

public class ContinuousCharPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        sc.close();
        // write code here

        for(int i=1; i<=n; i++){
            char ch = (char)('A'+(i-1));
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                if(ch=='Z')
                    ch = 'A';
                else
                    ch++;
            }
            System.out.println();
        }
    }
}
