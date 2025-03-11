package Module_01.String;

/*
    Pangrams
    A pangram is a string that contains every letter of the alphabet. Given a sentence determine whether it is a pangram in the English alphabet. Ignore case. Return either pangram or not pangram as appropriate.

    Input Format
    The first line inputs a string, S.

    Output Format
    In a new line, print "pangram" if string contains every letter of the alphabet else "not pangram".

    Example 1
    Input
    We promptly judged antique ivory buckles for the next prize

    Output
    pangram

    Explanation
    All of the letters of the alphabet are present in the string.

    Example 2
    Input
    We promptly judged antique ivory buckles for the prize

    Output
    not pangram

    Explanation
    The string lacks an x.
 */
import java.util.Scanner;

public class Pangrams {
    public  static void isPangram(String s)
    {
        // Your code here
        String str = s.toLowerCase();
        boolean[] flag = new boolean[26];

        for(char ch : str.toCharArray()){
            if(ch>='a' && ch<='z'){
                flag[ch-'a'] = true;
            }
        }

        for(boolean f : flag){
            if(!f){
                System.out.println("not pangram");
                return;
            }
        }
        System.out.println("pangram");
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        isPangram(s);

    }
}
