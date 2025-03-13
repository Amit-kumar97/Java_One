package Module_01.String;

/*
    Inverse Camel Case
    One of the important aspect of object oriented programming is readability of the code. To enhance the readability of code, developers write function and variable names in Camel Case.

    You are given a string S, written in Camel Case. Find All The Words Contained In It.

    Note Complete the given function. The input would be handled by the driver code. You only have to print the answer.

    Input Format
    The only line contains the string S.

    Output Format
    Print each word in a new line

    Example 1
    Input
    IAmAJavaProgrammer

    Output
    I
    Am
    A
    Java
    Programmer

    Explanation
    We separate each word and print them in a new line.

    Example 2
    Input
    OnePiece

    Output
    One
    Piece

    Explanation
    We separate each word and print them in a new line.
 */
import java.util.Scanner;

public class InverseCamelCase {
    public static void solution(String str) {
        int n = str.length();
        StringBuilder sb = new StringBuilder(String.valueOf(str.charAt(0)));

        for(int i=1; i<n; i++){
            if(Character.isUpperCase(str.charAt(i))){
                System.out.println(sb);
                sb = new StringBuilder(String.valueOf(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }
}
