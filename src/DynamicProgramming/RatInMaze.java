package DynamicProgramming;

import java.util.Scanner;

public class RatInMaze {
    public static int RatInMaze(int [][] arr, int n){
        int [][] dp = new int[n][n];
        dp[0][0] = arr[0][0];
        int [] X = new int []{0, 1};
        int [] Y = new int []{1, 0};
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                for(int k = 0 ; k < 2 ; k++){
                    if(i-X[k] >=0 && j-Y[k]>=0 && arr[i][j] != 0){
                        dp[i][j]+=dp[i-X[k]][j-Y[k]];
                    }
                }
            }
        }
        return dp[n-1][n-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(RatInMaze(arr, n));
    }
}
