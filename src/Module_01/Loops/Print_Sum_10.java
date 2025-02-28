package Module_01.Loops;

/*
    Print Sum 10
    Write a program to calculate the sum of first 10 natural number.

    Input Format
    No input.

    Output Format
    Print the sum of first 10 natural number.

    Example 1
    Input
    No input

    Output
    55

    Explanation
    1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
 */
public class Print_Sum_10 {
    public static void main(String[] args) {
        // your code here
        int sum = 0;
        for(int i=1; i<=10; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
