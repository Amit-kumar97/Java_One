package Module_01.Nested_Loop;

/*
    Armstrong Numbers in Range
    You are given two numbers m and n, you are required to print all the Armstrong Numbers between m and n (both inclusive).
    Armstrong Numbers are numbers those have the sum of their own digits raised to the power number of digits equals the number itself. Eg. 153 = 13 + 53 + 33, so 153 is an Armstrong number.

    Input Format
    First line contains two integers m and n

    Output Format
    Print all the Armstrong numbers between m and n in a single line with space   in between.

    Example 1
    Input
    0 160

    Output
    0 1 2 3 4 5 6 7 8 9 153
 */
import java.util.Scanner;

public class Armstrong_Numbers {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        findArmstrongNumber(m, n);

    }
    public static void findArmstrongNumber(int m, int n){
        if(m>n)
            System.out.println("-1");

        for(int i=m; i<=n; i++){
            String str = String.valueOf(i);
            int num = i;
            int ArmstrongNum = 0;
            while(num>0){
                int rem = num%10;
                ArmstrongNum += (int)Math.pow(rem, str.length());
                num = num/10;
            }
            if(i==ArmstrongNum)
                System.out.print(ArmstrongNum+" ");
        }
        System.out.println();
    }
}
