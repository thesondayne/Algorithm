/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BranchAndBound;

/**
 *
 * @author Dell
 */
public class Z_TapConCoSoPhanTu {
    //Cho mot tap hop tim ra cac tap con co so phan tu bang k va tong bang n
    static int[] X = new int[100];
    static int sum = 0;
    static int n;
    static int target;
    static int k;
    static int cnt=0;
    public static void Try(int i) {
        for (int j=1; j<=n; j++) {
            if (sum + j <= target && j > X[i - 1]) {
                X[i] = j;
                sum += j;
                if (i == k) {
                    if (sum == target) {
                        cnt++;
                        for (int l = 1; l <= i; l++) {
                            System.out.print(X[l]);
                        }
                        System.out.println();
                    }
                } else {
                    Try(i + 1);
                }
                sum -= j;
            }
        }
    }

    public static void main(String[] args) {
        n=16;
        k = 8;
        target = 91;
        // -> 28
        Try(1);
        System.out.println(cnt);
    }
}
