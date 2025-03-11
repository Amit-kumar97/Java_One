package Module_01.String;

import java.util.Scanner;

public class ToggleCharacters {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        toggleCase(n, str);
    }

    static void toggleCase(int n, String str) {
        // your code here
        // String for Storing result
        // String res = "";
        // iterate over the String
        for(char ch : str.toCharArray()){
            // converting lowercase to uppercase
            if(Character.isLowerCase(ch)){
                ch = Character.toUpperCase(ch);
            }
            // converting uppercase to lowercase
            else if(Character.isUpperCase(ch)){
                ch = Character.toLowerCase(ch);
            }
            // // put as it if for non-aphabetic words
            // else{
            //   res += ch;
            // }
            System.out.print(ch);
        }

    }
}
