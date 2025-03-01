package Module_01.Loops;

/*
    Difference of Sum and Product
    You are given an integer number n.
    print the difference between the product of its digits and the sum of its digits.

    Input Format
    single line consisting of an integer n.

    Output Format
    Print the difference between prod and sum.

    Example 1
    Input
    324

    Output
    15

    Explanation
    Product of digits = 3 * 2 * 4 = 24
    Sum of digits =  3 + 2 + 4 = 9
    Result = 24 - 9 = 15

    Example 2
    Input
    8

    Output
    0

    Explanation
    Product of digits = 8
    Sum of digits =  8
    Result = 8 - 8 = 0
 */
import java.util.Scanner;

public class SumProductDifference {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        int product = 1;

        while(n>0){
            int digit = n%10;
            sum += digit;
            product *= digit;

            n /= 10;
        }
        System.out.println(product-sum);
    }
}
