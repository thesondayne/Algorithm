package DynamicProgramming;

import java.util.Scanner;

public class TongBinhPhuongV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] dp = new int [n+1];
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = i;
            for(int j = 1; j <= Math.sqrt(i); j++){
                dp[i] = Math.min(dp[i], 1 + dp[i-j*j]);
            }
        }
        System.out.println(dp[n]);
    }
}
