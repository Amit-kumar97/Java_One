package Module_01.Loops;

/*
    Multiplication Table
    You are given an integer N.
    You are required to write a program that generates the multiplication table of a given number N.
    The program should read an integer N from the user and then output the multiplication table of N up to 20 times.

    Input Format
    single line consisting of an integer N.

    Output Format
    Print the Multiplication Table.

    Example 1
    Input
    8

    Output
    8 x 1 = 8
    8 x 2 = 16
    8 x 3 = 24
    8 x 4 = 32
    8 x 5 = 40
    8 x 6 = 48
    8 x 7 = 56
    8 x 8 = 64
    8 x 9 = 72
    8 x 10 = 80
    8 x 11 = 88
    8 x 12 = 96
    8 x 13 = 104
    8 x 14 = 112
    8 x 15 = 120
    8 x 16 = 128
    8 x 17 = 136
    8 x 18 = 144
    8 x 19 = 152
    8 x 20 = 160

    Explanation
    output is Multiplication Table of 8

    Example 2
    Input
    10

    Output
    10 x 1 = 10
    10 x 2 = 20
    10 x 3 = 30
    10 x 4 = 40
    10 x 5 = 50
    10 x 6 = 60
    10 x 7 = 70
    10 x 8 = 80
    10 x 9 = 90
    10 x 10 = 100
    10 x 11 = 110
    10 x 12 = 120
    10 x 13 = 130
    10 x 14 = 140
    10 x 15 = 150
    10 x 16 = 160
    10 x 17 = 170
    10 x 18 = 180
    10 x 19 = 190
    10 x 20 = 200

    Explanation
    output is Multiplication Table of 10
 */
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=20; i++){
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
}
