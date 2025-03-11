package Module_01.String;

/*
    Count words in a given string
    You are given a string containing some space-separated words. You need to count the number of words in the string.

    NOTE
    You need to complete the given function. The input and printing of output will be handled by the driver code.

    Input Format
    The first line contains the number of test cases.
    For each test case: The first line has the string S.

    Output Format
    For each test case return the number of words.

    Example 1
    Input:
    1
      this is  a sample   string
    Output
    5

    Explanation
    There are five words which are 'this' , 'is' , 'a' , 'sample' , 'string'.

    Example 2
    Input
    1
    gear five

    Output
    2

    Explanation
    The two words that are present here are 'gear', and 'five'.
 */
import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String p = sc.nextLine();
        while (t > 0) {
            String s = sc.nextLine();
            System.out.println(countWords(s));
            t--;
        }
    }

    public static int countWords(String s) {
        // your code here
        int itr = 0;
        int n = s.length();
        int count = 0;

        // iterate over whole string
        while(itr<n){
            // loop to skip all space-character
            while(itr<n && s.charAt(itr)==' '){
                itr++;
            }
            // increase counter when encounter with first character of a word
            if(itr<n){
                count++;
            }
            // skip all non-space character in a word
            while(itr<n && s.charAt(itr)!=' '){
                itr++;
            }
        }
        return count++;
    }
}
