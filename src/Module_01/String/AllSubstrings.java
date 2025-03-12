package Module_01.String;

/*
    All substrings of a string
    Given a string str, print all possible non-empty substrings of str, in order of occurrence in the string.

    Input Format
    Input consists of a single line of string.

    Output Format
    Print all the substrings of a string in order of occurrence in the string in different lines.

    Example 1
    Input
    abc

    Output
    a
    ab
    abc
    b
    bc
    c

    Explanation:
    These are the possible non-empty substrings.

    Example 2
    Input
    abcd

    Output
    a
    ab
    abc
    abcd
    b
    bc
    bcd
    c
    cd
    d

    Explanation:
    These are the possible non-empty substrings.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class AllSubstrings {
    static void SubString(String str) {
        //Write code here
        ArrayList<String> allSubStrings = new ArrayList<>();

        for(int i=0; i<str.length(); i++){
            for(int j=i; j<str.length(); j++){
                allSubStrings.add(str.substring(i, j+1));
            }
        }
        for(int i=0; i<allSubStrings.size(); i++){
            System.out.println(allSubStrings.get(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        SubString(str);
    }
}
