package Module_01.Loops;

/*
    Check Prime
    Write a program that inputs a positive integer N. It should then output a message indicating whether the number is a prime number or not.

    Input Format
    A single line containing the integer N

    Output Format
    Print a string, either "N is a prime number" or "N is not a prime number" (without quotes), depending on whether N is prime or not.

    Example 1
    Input
    5

    Output
    5 is a prime number

    Explanation
    5 is only divisible by itself and 1, hence it's a prime number.

    Example 2
    Input
    10

    Output
    10 is not a prime number

    Explanation
    1,2,5 & 10 are factors of 10, hence it is not a prime number.
 */
import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        // your code here
        sc.close();
        checkPrime(n);
    }
    public static void checkPrime(int n){
        if(n<=1)
            System.out.println(n+" is not a prime number");

        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                System.out.println(n+" is not a prime number");
                return;
            }
        }
        System.out.println(n+" is a prime number");
    }
}
