package DynamicProgramming;

import java.util.Scanner;

public class Z_MoveIn2dArray2 {
    static int [][] dp = new int [100][100];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 1; i <=n; i++) {
            dp[1][i] = arr[0][i-1];
        }
        for(int i=2;i<=n;i++){
            for(int j=1;j<=n;j++){
                dp[i][j] =Math.max( Math.max(dp[i-1 ][j-1],dp[i-1][j]), dp[i-1][j+1]) + arr[i-1][j-1];
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <=n; i++) {
            max = Math.max(max,dp[n][i]);
        }
        System.out.println(max);
    }
    // Nếu có số âm thì cần phải cẩn thận max bị coi là 0
}
