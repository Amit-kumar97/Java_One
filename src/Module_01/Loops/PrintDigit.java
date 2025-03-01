package Module_01.Loops;

/*
    Print Digits
    Given the number n, print its digits starting from most significant digit to least significant digit.

    Input Format
    Input consists of single line which has the integer n.

    Output Format
    print the digits of number one line at a time.

    Example 1
    Input
    1256

    Output
    1
    2
    5
    6

    Explanation
    Here, the digits are, 1,2,5,6.

    Example 2
    Input
    12345

    Output
    1
    2
    3
    4
    5

    Explanation
    Here the digits are 1,2,3,4,5.
 */
import java.util.Scanner;

public class PrintDigit {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String digits = "";

        while(n>0){
            digits += n%10;
            n /= 10;
        }
        for(int i=digits.length()-1; i>=0; i--){
            System.out.println(digits.charAt(i));
        }
    }
}
