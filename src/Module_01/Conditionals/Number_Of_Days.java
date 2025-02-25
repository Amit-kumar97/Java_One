package Module_01.Conditionals;

/*
    Number of Days
    Given the number of the month, your task is to calculate the number of days present in the particular month.

    Note:- Consider non-leap year.

    Input Format
    An integer M, denoting the number of the month.

    Output Format
    Return the number of days in the month corresponding to the given number. Consider a non-leap year.

    Example 1
    Input
    1

    Output
    31

    Explanation
    January has 31 days.

    Example 2
    Input
    3

    Output
    31

    Explanation
    March has 31 days.
 */
import java.util.Scanner;

public class Number_Of_Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();

        switch(M){
            case 1:
                System.out.println("31");
                break;
            case 2:
                System.out.println("28");
                break;
            case 3:
                System.out.println("31");
                break;
            case 4:
                System.out.println("30");
                break;
            case 5:
                System.out.println("31");
                break;
            case 6:
                System.out.println("30");
                break;
            case 7:
                System.out.println("31");
                break;
            case 8:
                System.out.println("31");
                break;
            case 9:
                System.out.println("30");
                break;
            case 10:
                System.out.println("31");
                break;
            case 11:
                System.out.println("30");
                break;
            case 12:
                System.out.println("31");
                break;
        }
    }
}
