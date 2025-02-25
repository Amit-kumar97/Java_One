package Module_01.Conditionals;

/*
    Days Of A Week
    Write a program that takes a number n and displays the name of the weekday, if n is >7 print Invalid

    Input Format
    First line contain a number n

    Output Format
    Print the name of the weekday. Print Invalid if the number is greater than 7.

    Example 1
    Input
    1

    Output
    Monday

    Example 2
    Input
    8

    Output
    Invalid
 */
import java.util.Scanner;

public class Days_Of_Week {
    public static void main(String[] args) {
        //write code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(dayOfWeek(n));
    }
    public static String dayOfWeek(int n){
        if(n==1)
            return "Monday";
        else if(n==2)
            return "Tuesday";
        else if(n==3)
            return "Wednesday";
        else if(n==4)
            return "Thursday";
        else if(n==5)
            return "Friday";
        else if(n==6)
            return "Saturday";
        else if(n==7)
            return "Sunday";
        else
            return "Invalid";
    }
}
