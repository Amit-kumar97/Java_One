package Module_01.Array_2D;

import java.util.Scanner;

class Solution4 {
    public int[][] rotateBy90(int [][]mat) {
        // Your code here

        // Step 1=> first we will transpose the matrix and
        // Step 2=> then we will swap each columns

        // Step 1
        int n = mat.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // Step 2
        for(int i=0; i<n; i++){
            int left = 0;
            int right = n-1;
            while(left<right){
                int t = mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right] = t;
                left++;
                right--;
            }
        }
        return mat;
    }
}


public class Rotate_Matrix_90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int [][]mat=new int[n][m];
        for(int i=0;i<n;++i){
            for(int j=0;j<m;++j){
                mat[i][j]=sc.nextInt();
            }
        }
        Solution4 Obj = new Solution4();
        int[][] ans = Obj.rotateBy90(mat);
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println('\n');
    }
}
