package Module_01.ArrayList;

/*
    Pascal's Triangle
    You are given a number n, you are required to print the first n rows of the pascal triangle.

    Your task is to complete the function pascalTriangle which receives n as the parameters and returns a 2D array containing the first n rows of the pascal's triangle.

    Input Format
    You are given a single integer n representing the number of rows of pascal's triangle.

    Output Format
    Print n lines of output, where ith line represents the ith row of the triangle.

    Example 1
    Input
    3

    Output
    1
    1 1
    1 2 1

    Example 2
    Input
    5

    Output
    1
    1 1
    1 2 1
    1 3 3 1
    1 4 6 4 1
 */
import java.util.ArrayList;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> triangle = pascalTriangle(n);
        for (ArrayList<Integer> integers : triangle) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> pascalTriangle(int numRows) {
        // write code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }

        ArrayList<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            ArrayList<Integer> prevRow = result.get(i - 1);
            ArrayList<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);

            for (int j = 1; j < i; j++) {
                currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            currentRow.add(1);
            result.add(currentRow);
        }
        return result;
    }
}
