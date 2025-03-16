package Module_01.String;

/*
    Lower or Upper
    Given a character ch, check if it is an Uppercase letter or Lowercase letter. Return U if ch is an Uppercase letter and L if ch is Lowercase letter.

    Input Format
    First line contains a character ch

    Output Format
    Return the character L or U according to the question.

    Example 1
    Input
    k

    Output
    L

    Example 2
    Input
    K

    Output
    U
 */
import java.util.Scanner;

public class LowerOrUpper {
    public static char LowerUpper(char ch) {
        //Write your code here
        if(Character.isLowerCase(ch))
            return 'L';
        else
            return 'U';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        System.out.println(LowerUpper(ch));
    }
}
