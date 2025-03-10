package Module_01.ArrayList;

/*
    Pascal's Triangle II
    Given a number n, print the nth row of the Pascal's triangle.
    Your task is to complete the function pascalTriangleRow which receives n as the parameter and returns the nth row of the pascal's triangle.

    Input Format
    There is a single line of input representing n.

    Output Format
    Return the nth row of the Pascal’s triangle

    Example 1
    Input
    4

    Output
    1 3 3 1

    Explanation
    The elements in the 4th row are 1 3 3 1.

    Example 2
    Input
    1

    Output
    1

    Explanation
    The elements in the 1st row are 1.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class PascalTriangle_02 {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> triangle = pascalTriangleRow(n);
        for (Integer integer : triangle) {
            System.out.print(integer + " ");
        }
    }

    public static ArrayList<Integer> pascalTriangleRow(int numRows) {
        // write code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return new ArrayList<Integer>();
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
        return new ArrayList<Integer>(result.get(numRows-1));
    }
}
