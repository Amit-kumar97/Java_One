package Module_01.Nested_Loop;

/*
    Star Pyramid
    Given an integer n, print a pyramid full of stars with height equal to n.

    Input Format
    The first line of input contains the integer n.

    Output Format
    The output should contain a pyramid filled with stars with height equal to n.

    Example 1
    Input
    3

    Output:
      *
     * *
    * * *

    Example 2
    Input
    7

    Output
          *
         * *
        * * *
       * * * *
      * * * * *
     * * * * * *
    * * * * * * *

 */
import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Write your code here
        pattern(n);
    }
    public static void pattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=i; j<n; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
