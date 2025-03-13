package Module_01.String;


/*
    Distinct Palindromic SubStrings
    Given a string s, print all the substrings of s that are palindromic. Print all the required substrings in lexicographical order.

    A substring is a subset or part of another string, or it is a contiguous sequence of characters within a string.
    A lexicographic order is an arrangement of characters, words, or numbers in alphabetical order, that is, the letters are sorted from A-Z.

    Input Format
    First line contains a string s.

    Output Format
    Print various strings according to the question, each string should be in a new line

    Example 1
    Input
    abc

    Output
    a
    b
    c

    Example 2
    Input
    abccbc

    Output
    a
    b
    bccb
    c
    cbc
    cc
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class DistinctPalindromeSubstrings {
    static void palindromeSubStrs(String s) {
        //Write your code here
        int n = s.length();
        HashSet<String> distinctPalindrome = new HashSet<>();

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                String subString = s.substring(i, j+1);
                if(isPalindrome(subString)){
                    distinctPalindrome.add(subString);
                }
            }
        }
        ArrayList<String> myList = new ArrayList<>(distinctPalindrome);
        Collections.sort(myList);

        for(String st : myList){
            System.out.println(st);
        }
    }
    public static boolean isPalindrome(String s){
        String sb = new StringBuilder(s).reverse().toString();
        return s.equals(sb);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        palindromeSubStrs(s);
    }
}
