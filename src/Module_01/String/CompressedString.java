package Module_01.String;

/*
    Compressed Strings
    You are given a string 'S'. You need to compress it using the following algorithms:

    Take an empty string res. For every block of consecutive repeating character, do the following:

    If the size of block is 1, concatenate it to the end of `S`.
    Else, concatenate the character followed by the size of the block.

    Return res after completing the above operations on the whole string

    Note
    StringBuilder in Java represents a mutable sequence of characters.

    Input Format
    The first line contains the number of test cases.

    For each test case: The first line contains the string 'S'

    Output Format
    For each test case return the string res. Input and output is inbuilt.

    Example 1
    Input:
    1
    abbbccd

    Output:
    ab3c2d
    Explanation:
    a occurs once, so, we add a to res.
    Then, b is repeated 3 times so, b3 is added.
    Then, c is repeated 2 times so, c2 is added.
    d occurs once, so, we add d to res.

    Example 2
    Input:
    1
    aabccc

    Output:
    a2bc3

    Explanation:
    a is repeated 2 times so, a2 is added.
    b occurs once, so, we add b to res.
    Then, c is repeated 3 times so, c3 is added.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompressedString {
    static void compressedString(String s) {
        // write your code here
        int n = s.length();
        // StringBuilder res = new StringBuilder();

        System.out.print(s.charAt(0));
        int count = 1;
        for(int i=1; i<n; i++){
            char currCh = s.charAt(i);
            char prevCh = s.charAt(i-1);
            if(currCh==prevCh)
                count++;

            else{
                if(count>1) System.out.print(count);

                System.out.print(currCh);
                count = 1;
            }
        }
        if(count>1) System.out.print(count);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-- > 0){
            String s = br.readLine();
            compressedString(s);
            System.out.println();
        }
    }
}
