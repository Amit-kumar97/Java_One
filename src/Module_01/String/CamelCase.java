package Module_01.String;

/*
    Camel Case
    You are given a string consisting of different words separated by underscores _. You have to convert the string to camel case. The first letter of the entire case should be lowercase.

    eg: app_dsd_sdda to appDsdSdda

    Input Format
    The first line contains the number of test cases.
    For each test case: The first line contains the string S.

    Output Format
    For each test case print the final formed string in a new line.

    Example 1
    Input:
    1
    abb_b_cc_d

    Output:
    abbBCcD

    Explanation:
    We remove the underscores and convert the next character to uppercase.

    Example 2
    Input:
    1
    how_are_you

    Output:
    howAreYou

    Explanation:
    We remove the underscores and convert the next character to uppercase.
 */
import java.util.Scanner;

public class CamelCase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            camelCase(s);
            System.out.println();

        }
    }

    static void camelCase(String s) {
        // your code here
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch=='_')
                continue;

            if(i>0 && s.charAt(i-1)=='_'){
                ch = Character.toUpperCase(ch);
                System.out.print(ch);
            }
            else{
                System.out.print(ch);
            }
        }
    }
}
