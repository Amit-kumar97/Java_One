package Module_01.Array_2D;

/*
    Maxima Minima
    Given an n*n matrix mat find an element such that it is the smallest in a row and largest in a column, if such an element does not exist return -1.

    Input Format
    First line contains the values n.
    Next n lines contain n spaced integers.

    Output Format
    Return the element that is smallest in a row and largest in a column if not found return -1.

    Example 1
    Input
    2
    1 3
    6 5

    Output
    5

    Explanation
    Row 2 contains minimum element 5 that is largest in the 2nd column.

    Example 2
    Input
    3
    1 2 3
    4 5 6
    7 8 9

    Output
    7

    Explanation
    Here the minimum value is 7 in the third row and the largest value in the 1st column.
 */
import java.util.Scanner;

public class Maxima_Minima {
    public static int maximaMinima(int[][] mat) {
        //Write code here
        int n = mat.length;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            int minRowValue = mat[i][0];
            int minColIndex = 0;
            for(int j=0; j<n; j++){
                if(mat[i][j]<minRowValue)
                    minRowValue = mat[i][j];
                minColIndex = j;
            }

            boolean isLargest = true;
            for(int k=0; k<n; k++){
                if(mat[k][minColIndex]>minRowValue){
                    isLargest = false;
                    break;
                }
            }

            if(isLargest)
                return minRowValue;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();
        int result = maximaMinima(matrix);
        System.out.println(result);
        sc.close();
    }
}
