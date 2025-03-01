package Module_01.Loops;

/*
    AS Loops Problem 1
    Write a program to enter numbers till the user wants and in the end the program should print the largest and smallest numbers.

    Input Format
    Enter input of a number from user

    Next ask user if they want to enter another number or not

    If user says yes(y/Y) then enter number again but if the user says no(n/N) then simply stop

    Output Format
    Print the largest number in line 1 and smallest number in line 2 as shown in sample test cases

    Example 1
    Input
    10
    y
    5
    Y
    100
    y
    256
    n

    Output
    Largest number: 256
    Smallest number: 5

    Example 2
    Input
    98
    y
    2341
    Y
    -21
    N

    Output
    Largest number: 2341
    Smallest number: -21
 */
import java.util.Scanner;

public class AS_Problem_01 {
    public static void main(String[] args) {
        // your code here
        Scanner sc = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean continueEntering = true;

        while(continueEntering){
            // System.out.println("Enter a number");
            int number = sc.nextInt();

            if(number>max){
                max = number;
            }
            if(number<min){
                min = number;
            }

            // System.out.println("Do you want to enter another number (y/n)?");
            String response = sc.next();

            if(response.equalsIgnoreCase("n")){
                continueEntering = false;
            }
        }

        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
    }
}
