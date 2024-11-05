package DynamicProgramming;

import java.util.Scanner;

public class Z_MoveIn2dArray {
    static int [][] dp = new int [100][100];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] arr = new int[n][m];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=m;j++){
                dp[i][j] = Math.max(Math.max(dp[i-1][j],dp[i][j-1]), dp[i-1][j-1]) + arr[i-1][j-1];
            }
        }
        System.out.println(dp[n][m]);
    }
}
