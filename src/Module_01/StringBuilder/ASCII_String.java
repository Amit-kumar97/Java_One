package Module_01.StringBuilder;

/*
    ASCII string
    You are given a string str that contains only lowercase alphabets.
    You have to form a string that contains the difference of ASCII values of every two consecutive characters between those characters.
    Note Complete the given function. The input and output would be handled by the driver code.

    Input Format
    The only line contains the string str.

    Output Format
    Print the new string.

    Example 1
    Input
    abecd

    Output
    a1b3e-2c1d

    Explanation
    'b' - 'a' = 1
    'e' - 'b' = 3
    'c' - 'e' = -2
    'd' - 'c' = 1

    Example 2
    Input
    abc

    Output
    a1b1c

    Explanation
    'b' - 'a' = 1
    'c' - 'b' = 1
 */
import java.util.Scanner;

public class ASCII_String {
    public static String solution(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));

        for(int i=1; i<str.length(); i++){
            int diff = str.charAt(i)-str.charAt(i-1);
            sb.append(diff).append(str.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(solution(str));
    }
}
