package Module_01.Nested_Loop;

/*
    Star Pattern 2
    Take input of N from the user and write a program to print the following pattern (N=3) :
    * * *
    * *
    *
    Input Format
    First line contains an integer N.

    Output Format
    Print the required pattern.

    Example 1
    Input
    3

    Output
    * * *
    * *
    *

    Explanation
    Pattern for N=3.

    Example 2
    Input
    4

    Output
    * * * *
    * * *
    * *
    *

    Explanation
    Pattern for N=4.
 */
import java.util.Scanner;

public class StartPattern02 {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=n-i+1; j>0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
