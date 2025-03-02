package Module_01.Nested_Loop;

/*
    Star Pattern 1
    Take input of N from the user and write a program to print the following pattern (N=5) :

    *
    * *
    * * *
    * * * *
    * * * * *

    Input Format
    single line consisting of an integer N.

    Output Format
    Print the required pattern.

    Example 1
    Input
    5

    Output
    *
    * *
    * * *
    * * * *
    * * * * *

    Explanation
    Pattern for N = 5

    Example 2
    Input
    3

    Output
    *
    * *
    * * *

    Explanation
    Pattern for N = 3
 */
import java.util.Scanner;

public class StarPattern01 {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
