package Module_01.StringBuilder;

/*
    Strange String
    You are given an integer 'N' and an empty string 'S'. You need to modify the string using the given operations to make it of length 'N'.

    Insert the first character in the beginning of string, the second in the end, the third in the beginning, fourth in the end, and so on.
    The first character should be a, followed by b, c, and so on. z will be followed by a.

    Note: StringBuilder in Java represents a mutable sequence of characters.

    Input Format
    The first line contains the number of test cases.

    For each test case: The first line contains a single integer 'N'.

    Output Format
    For each test case print the string 'S' of length 'N' in a new line.

    Example 1
    Input:
    1
    3

    Output:
    cab

    Explanation:
    The first character to be inserted in the beginning is 'a', second is 'b' which is inserted at the end making our string as 'ab', third character 'c', is inserted in the beginning which makes our string 'cab'.

    Example 2
    Input:
    1
    4

    Output:
    cabd

    Explanation:
    The first character to be inserted in the beginning is 'a', second is 'b' which is inserted at the end making our string as 'ab',
    third character 'c', is inserted in the beginning which makes our string 'cab', the fourth character 'd' is inserted in the end making our stirng as cabd.

 */
import java.util.Scanner;

public class StrangeString {
    static String strangeString(int n) {
        //Write your code here
        StringBuilder sb = new StringBuilder();
        char ch = 'a';
        for(int i=1; i<=n; i++){
            if(ch>'z')
                ch = 'a';
            if(i%2!=0){
                sb.append(ch++);
            }
            else{
                sb.insert(0, ch++);
            }
        }
        return sb.reverse().toString();
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0){
            int n = input.nextInt();
            System.out.println(strangeString(n));
        }
    }
}
