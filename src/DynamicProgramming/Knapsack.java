package DynamicProgramming;

import java.util.Scanner;

public class Knapsack {
    /* Tạo ra mảng 2 chiều dp [][] với dp[i][j] là kết quả đạt được khi chọn các đồ vật
    từ đầu đến i với chiếc túi có trọng lượng là j */
    public static int knapsack(int n, int w, int[] weight, int[] value) {
        int[][] dp = new int[n + 1][w + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= w; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                    // Bài toán con bé nhất
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= w; j++) {
                // Lấy giá trí của cái túi đến mức i-1;
                dp[i][j] = dp[i - 1][j];
                if (weight[i] <= j) { // Kiểm tra xem có thể cho được vật phẩm i vào túi hay không
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - weight[i]] + value[i]);
                    // So giá trị trước đó với , giá trí lớn nhất của cái túi với các đồ vật đến i-1
                    // với trọng lượng j-weight[i] + thêm cho value [i]
                }
            }
        }
        return dp[n][w];
        // Kết quả cuối cùng
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int [] weight = new int[n+1];
        int [] value = new int[n+1];
        for (int i = 1; i <= n; i++) {
            value[i] = sc.nextInt();
            weight[i] = sc.nextInt();
        }
        System.out.println(knapsack(n, w, weight, value));
    }
}
