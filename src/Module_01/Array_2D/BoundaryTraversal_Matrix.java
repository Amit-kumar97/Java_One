package Module_01.Array_2D;

/*
    Boundary Traversal of matrix
    Given an m*n matrix, print the boundary traversal of the matrix in clockwise order.

    Input Format
    First line contains the values m and n.
    Next m lines contain n-spaced integers.

    Output Format
    Print the boundary traversal of the matrix in clockwise order.

    Example 1
    Input
    2 3
    1 2 3
    1 5 3

    Output
    1 2 3 3 5 1

    Explanation
    We can see that while traversing in a clockwise fashion we go in the order of 1, 2, 3, 3, 5, 1.

    Example 2
    Input
    3 4
    5 4 6 3
    1 4 3 5
    5 1 9 6

    Output
    5 4 6 3 5 6 9 1 5 1

    Explanation
    We can see that while traversing in a clockwise fashion we go in the order of 5, 4, 6, 3, 5, 6, 9, 1, 5, 1.
 */
import java.util.Scanner;

public class BoundaryTraversal_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        boundaryTraversal(m, n, matrix);
        sc.close();
    }

    public static void boundaryTraversal(int m, int n, int[][] matrix) {
        // your code here
        // base cases
        if(m==1){
            for(int idx=0; idx<n; idx++){
                System.out.print(matrix[0][idx]+" ");
            }
            return;
        }
        if(n==1){
            for(int idx=0; idx<m; idx++){
                System.out.print(matrix[idx][0]+" ");
            }
            return;
        }

        // first row --->towards right
        for(int idx=0; idx<n; idx++){
            System.out.print(matrix[0][idx]+" ");
        }
        // right most column---> towards bottom
        for(int idx=1; idx<m; idx++){
            System.out.print(matrix[idx][n-1]+" ");
        }
        // bottom row ----> towards left
        for(int idx=n-2; idx>0; idx--){
            System.out.print(matrix[m-1][idx]+" ");
        }
        // right most column ---> towards top
        for(int idx=m-1; idx>0; idx--){
            System.out.print(matrix[idx][0]+" ");
        }
    }
}
