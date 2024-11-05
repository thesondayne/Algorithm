package DynamicProgramming;

import java.util.Scanner;

public class SquareCut {
    public static int SquareCut (int a, int b){
        int [][] dp = new int[a+1][b+1];
        dp[1][1] = 0;
        for(int i=1;i<=a;i++){
            for(int j=1;j<=b;j++){
                if(i==j){
                    dp[i][j] = 0;
                }
                else if(i>j){
                    dp[i][j] = dp[i-j][j] + 1;
                }
                else{
                    dp[i][j] = dp[i][j-i] + 1;
                }
            }
        }
        return dp[a][b];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(SquareCut(a,b));
    }
}
