package Module_01.Conditionals;

/*
    Grading System
    You are given marks of a student as input. Display a correct message based on the following rules:

    for marks above 90, print "Excellent".
    for marks above 80 and less than equal to 90, print "Good"
    for marks above 70 and less than equal to 80, print "Fair".
    for marks above 60 and less than equal to 70, print "Meets Expectations".
    for marks below and equal to 60, print "Below Expectations".

    Input Format
    There is a single integer N.

    Output Format
    Print a single string in a line.

    Example 1
    Input
    95

    Output
    Excellent

    Explanation
    As according to the given condition, for N (marks) >90 - Excellent is printed

    Example 2
    Input
    75

    Output
    Fair

    Explanation
    As according to the given condition, for 70 < N (marks) <= 80 - Fair is printed
 */
import java.util.Scanner;

public class Grading_System {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        grades(n);
    }
    public static void grades(int n){
        if(n>90)
            System.out.println("Excellent");
        else if(n>80 && n<=90)
            System.out.println("Good");
        else if(n>70 && n<=80)
            System.out.println("Fair");
        else if(n>60 && n<=70)
            System.out.println("Meets Expectations");
        else
            System.out.println("Below Expectations");
    }
}
