package Module_01.Nested_Loop;

/*
    Optimus Prime
    Given an integer n, print all prime numbers between 1 and n (both inclusive).

    Example:
    If n = 8, your program should output all prime numbers between 1 and 8. Thus, it should output:

    2
    3
    5
    7

    Input Format
    The first line of the input contains one integer n.

    Output Format
    Your code should output all integers between 1 and n that are prime (both inclusive).

    Example 1
    Input:
    8

    Output:
    2
    3
    5
    7

    Example 2
    Input:
    13

    Output:
    2
    3
    5
    7
    11
    13
 */
import java.util.Scanner;

public class OptimusPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Your code here

        findPrime(n);
    }
    static void findPrime(int n){
        if(n==1){
            System.out.println("-1");
        }

        for(int i=2; i<=n; i++){
            if(checkPrime(i)){
                System.out.println(i);
            }
        }
    }
    static boolean checkPrime(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
