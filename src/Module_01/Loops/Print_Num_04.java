package Module_01.Loops;

/*
    Print N-1 to 0
    You are given an integer N.
    You are required to write a program that prints numbers from N-1 to 0
    where N is a positive integer provided by the user.

    Input Format
    single line consisting of an integer N.

    Output Format
    Print numbers from N-1 to 0.

    Example 1
    Input
    5

    Output
    4 3 2 1 0

    Explanation
    Print numbers from 4 to 0.

    Example 2
    Input
    8

    Output
    7 6 5 4 3 2 1 0

    Explanation
    Print numbers from 7 to 0
 */
import java.util.Scanner;

public class Print_Num_04 {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n-->0){
            System.out.print(n+" ");
        }
    }
}
