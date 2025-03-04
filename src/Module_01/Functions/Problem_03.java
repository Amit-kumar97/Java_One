package Module_01.Functions;

/*
    Function Problem 3
    Lily wants to enter a positive integer and increase its value by 5 using for loop.
    She wants to increase the value in fun function & print the result in the caller function.
    Help Lily by writing a program for the same.

    Input Format
    First line contains an integer n

    Output Format
    Output will be (n+5)

    Example 1
    Input
    15

    Output
    20

    Explanation
    The value is increased by 5 so 15+5 becomes 20

    Example 2
    Input
    10

    Output
    15

    Explanation
    The value is increased by 5 so 10+5 becomes 15
 */
import java.util.Scanner;

public class Problem_03 {
    static int fun(int n){
        // write code here
        int output = n;

        for(int i=1; i<=5; i++){
            output += 1;
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int result = fun(n);
        System.out.print(result);
    }
}
