package Module_01.Nested_Loop;

/*
    Diamond Pattern
    Given an integer N, print a diamond full of stars * with height equal to N.
    Note It is given that N is odd.

    Input Format
    The first line contains the number of test cases.

    For each test case: The first line contains an integer N denoting the height of the pyramid.

    Output Format
    For each test case print the required pattern.

    Example 1
    Input
    1
    5

    Output

    Explanation
    The required diamond of height 5 has been returned.

    Example 2
    Input
    1
    3

    Output

    Explanation
    The required diamond of height 3 has been returned
 */
import java.util.Scanner;

public class Diamond_Pattern {
    public static void main(String[] args) {
        //Write your code here
        //Take required input and print the output
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            pattern(n);
            System.out.println();
        }
    }

    public static void pattern(int n){
        // top half of diamond including middle

        int space = n - 1;
        for (int j = 1; j <= n; j++){
            for (int i = 1; i <= space; i++)
            {
                System.out.print("  ");
            }
            space--;
            for (int i = 1; i <= 2 * j - 1; i++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        space = 1;
        for (int j = 1; j <= n - 1; j++) {
            for (int i = 1; i <= space; i++) {
                System.out.print("  ");
            }
            space++;
            for (int i = 1; i <= 2 * (n - j) - 1; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
//        for(int i=0; i<=n/2; i++){
//            int star = 2*i+1; // no. of stars for ith-row
//            int space = n/2-i; // no. of spaces
//
//            for(int j=0; j<space; j++){
//                System.out.print("  ");
//            }
//            for(int j=0; j<star; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        // bottom half of diamond excluding middle row
//        int space = 1;
//        for (int j = 1; j <= n - 1; j++) {
//            for (int i = 1; i <= space; i++) {
//                System.out.print("  ");
//            }
//            space++;
//            for (int i = 1; i <= 2 * (n - j) - 1; i++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//            for(int i=n/2; i>=0; i--){
//            int star = n-2;
//            int space = n/2-i+1;
//
//            for(int j=0; j<space; j++){
//                System.out.print("  ");
//            }
//            for(int j=0; j<star; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }
}
