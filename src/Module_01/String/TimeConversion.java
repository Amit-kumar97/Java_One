package Module_01.String;

/*
    Time Conversion
    Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.

    Note
    12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
    12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

    Input Format
    First line contains a 12-hour clock time as a string s.

    Output Format
    Print the 24-hour clock time.

    Example 1
    Input
    07:05:45PM

    Output
    19:05:45

    Explanation
    The seventh hour in a 12 hour clock (in post meridiem) can be represented as nineteenth hour on a 24 hour clock.
    The minute value and second value remain unchanged. So, the time on 24 hour clock is 19:05:45.

    Example 2
    Input
    12:01:00PM

    Output
    12:01:00

    Explanation
    The twelfth hour of 12 hour clock (in post meridiem) remains unchanged on 24 hour clock.
    The minute value and second value also remain unchanged. So, the time on 24 hour clock is 12:01:00.
 */
import java.util.Scanner;

public class TimeConversion {
    static void timeConversion(String s) {
        //Write your code here
        if(s.contains("AM")){
            if(s.substring(0,2).equals("12"))
                System.out.println("00"+s.substring(2,8));
            else{
                System.out.println(s.substring(0, 8));
            }
        }
        else if(s.contains("PM")){
            int hour = Integer.parseInt(s.substring(0, 2));
            if(hour<12)
                System.out.println(12+hour+s.substring(2, 8));
            else
                System.out.println(s.substring(0, 8));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        timeConversion(str);
        sc.close();
    }
}
