package Module_01.Conditionals;

/*
    Conditional Problem 2
    You are given a number N. Write a program using If Else such that if N is less than 30 then the output will be "less important" otherwise the output will be "more important".

    Input Format
    The first line contains an integer.

    Output Format
    If the number is less than 30 then "less important" will be printed. If the number is not less than 30 then "more important" will be printed.

    Example 1
    Input
    30

    Output
    more important

    Explanation
    Since 30 is not less than 30 answer is "more important".

    Example 2
    Input
    23

    Output
    less important

    Explanation
    Since 23 is less than 30 answer is "less important".
 */
import java.util.Scanner;

public class Problem_02 {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n<30)
            System.out.println("less important");
        else
            System.out.println("more important");
    }
}
