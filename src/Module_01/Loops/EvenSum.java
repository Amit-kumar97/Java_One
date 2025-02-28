package Module_01.Loops;

/*
    Even Sum
    You are given a number N. Print sum of all even numbers from 1 to N.

    Input Format
    There is only an integer N.

    Output Format
    Print the sum as a single integer.

    Example 1
    Input
    12

    Output
    42

    Explanation
    The sum of even numbers till 12 is 42. (2+4+6+8+10+12=42)

    Example 2
    Input
    13

    Output
    42

    Explanation
    The sum of even numbers till 12 is 42. (2+4+6+8+10+12=42)
 */
import java.util.Scanner;

public class EvenSum {
    public static void main(String[] args) {
        // your code here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();

        long sumOfEven = 0;
        for(int i=1; i<=n; i++){
            if(i%2==0)
                sumOfEven += i;
        }
        System.out.println(sumOfEven);
    }
}
