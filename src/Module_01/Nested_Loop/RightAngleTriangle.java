package Module_01.Nested_Loop;

/*
    Right Angle Triangle Stars
    Given an integer n, print a right angled triangle full of stars with height and base equal to n.

    Input Format
    The first line of input contains the integer n.

    Output Format
    The output should contain a right angled triangle filled with stars with height and base equal to n.

    Example 1:
    Input
    3

    Output:
    *
    **
    ***

    Explanation:
    Since n = 3, 3 lines with increasing number of stars are printed.

    Example 2:
    Input
    7

    Output
    *
    **
    ***
    ****
    *****
    ******
    *******

    Explanation:
    Since n = 7, 7 lines with increasing number of stars are printed
 */
import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Write your code here
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
