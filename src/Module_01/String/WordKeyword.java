package Module_01.String;

/*
    Word from Keyboard
    You are given array of strings, you need to print words from that array which can be typed using only one row of Keyboard.

    First row of keyboard = "qwertyuiop"
    Second row of keyboard = "asdfghjkl"
    Third row of keyboard = "zxcvbnm"

    KeyBoard
    Input Format
    First line contains n number of strings in array

    Next n lines contains strings denoting elements of array

    Output Format
    Print strings which can be formed using single row of keyboard in separate lines

    Example 1
    Input
    2
    glad
    monkey

    Output
    glad

    Explanation
    glad can be formed only from the characters present in row 2

    Example 2
    Input
    3
    horse
    peter
    jass

    Output
    peter
    jass
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordKeyword {
    static ArrayList<String> getStrings(ArrayList<String> arr)
    {
        // write your code here
        ArrayList<String> list = new ArrayList<>();
        String first = "qwertyuiop";
        String second = "asdfghjkl";
        String third = "zxcvbnm";

        for(String str : arr){
            boolean flag = true;
            if(first.contains(""+str.charAt(0))){
                for(char ch : str.toCharArray()){
                    if(!first.contains(""+ch))
                        flag = false;
                }
                if(flag) list.add(str);
            }
            else if(second.contains(""+str.charAt(0))){
                for(char ch : str.toCharArray()){
                    if(!second.contains(""+ch))
                        flag = false;
                }
                if(flag) list.add(str);
            }
            else{
                for(char ch : str.toCharArray()){
                    if(!third.contains(""+ch))
                        flag = false;
                }
                if(flag) list.add(str);
            }
        }
        return list;
    }

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> arr = new ArrayList<String>();

        for(int i = 0; i < n; i++){
            String s = sc.next();
            arr.add(s);
        }

        ArrayList<String> result = getStrings(arr);
        for(int i = 0; i < result.size(); i++){
            System.out.println(result.get(i));
        }
    }
}
