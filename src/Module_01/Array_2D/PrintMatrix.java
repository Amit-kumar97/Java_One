package Module_01.Array_2D;

import java.util.Scanner;

class Solution1 {
    public void printMatrixColumnwise(int[][] mat, int n, int m) {
        // Write code here and print output

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(mat[j][i]+ " ");
            }
        }
    }
}

public class PrintMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t > 0) {
            int n;
            int m;
            n = sc.nextInt();
            m = sc.nextInt();
            int[][] matrix = new int[n][m];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < m; j++)
                    matrix[i][j] = sc.nextInt();
            Solution1 Obj = new Solution1();
            Obj.printMatrixColumnwise(matrix, n, m);
            System.out.println();
            t--;
        }
        sc.close();
    }
}