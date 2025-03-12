package Module_01.String;

/*
    Palindrome String
    Given a string str, determine if it is a palindrome, considering only alphabetic characters and ignoring the upper or lower case. Return 0 if it is not a palindrome, else return 1.

    Input Format
    Input consists of one line

    The first line given is a string str.

    Output Format
    Returns 0 if it is not a palindrome, else return 1 if it is a palindrome

    Example 1
    Input
    race a car

    Output
    0

    Explanation
    Not a palindrome

    Example 2
    Input
    a man, a plan, a canal Panama

    Output
    1

    Explanation
    It is a palindrome.
 */
import java.util.Scanner;

public class PalindromeString {
    static int isPalindrome(String str){
        //write code here
        String st = str.toLowerCase();
        int n = str.length();

        StringBuilder filtered = new StringBuilder();
        // filtering all Character from the input String
        for(int i=0; i<n; i++){
            if(Character.isLetter(st.charAt(i))){
                filtered.append(st.charAt(i));
            }
        }
        // reverse String
        String reversed = new StringBuilder(filtered).reverse().toString();
        return filtered.toString().equals(reversed) ? 1 : 0;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int result = isPalindrome(str);
        System.out.println(result);
    }
}
