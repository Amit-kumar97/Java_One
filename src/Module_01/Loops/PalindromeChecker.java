package Module_01.Loops;

/*
    Palindrome Checker
    Given a number N, you need to check whether the given number is Palindrome or not. A number is said to be Palindrome when it reads the same from backwards as forward.

    Note: Input number will not have any trailing zeros.

    Input
    The line inputs N.

    Output
    You need to print "true" if the number is palindrome otherwise "false" (without quotes).

    Example 1
    Input
    5

    Output
    true

    Example 2
    Input
    121

    Output
    true
 */
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Write your code here and print the required output
        String x = "";
        int m = n;
        while(m>0){
            x += m%10;
            m /= 10;
        }
        if(n==Integer.parseInt(x))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
