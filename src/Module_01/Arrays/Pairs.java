package Module_01.Arrays;

import java.util.Scanner;

public class Pairs {
    public int Pairs(int []arr,int k){
        //your code here
        int countPairs = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                int diff = Math.abs(arr[i]-arr[j]);
                if(diff==k)
                    countPairs++;
            }
        }

        return countPairs;
    }
}

class MainPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        n = sc.nextInt();
        k = sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;++i){
            arr[i]=sc.nextInt();
        }
        Pairs Obj = new Pairs();
        System.out.println(Obj.Pairs(arr,k));
    }
}
