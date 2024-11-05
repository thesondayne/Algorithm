/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BranchAndBound;

/**
 *
 * @author Dell
 */
public class Z_NQueen2 {

    static int max = 0;
    static int sum = 0;
    static int n;
    static int X[] = new int[100];
    static boolean xuoi[] = new boolean[100];
    static boolean nguoc[] = new boolean[100];
    static boolean cot[] = new boolean[100];
    static int a[][];

    public static void Try(int i) {
        for (int j = 1; j <= n; j++) {
            if (!xuoi[n + i - j] && !nguoc[i + j - 1] && !cot[j]) {
                sum += a[i][j];
                xuoi[n + i - j] = true;
                nguoc[i + j - 1] = true;
                cot[j] = true;
                if (i == n) {
                    for (int l = 1; l <= n; l++) {
                        max = Math.max(sum, max);
                    }
                } else {
                    Try(i + 1);
                }
                xuoi[n + i - j] = false;
                nguoc[i + j - 1] = false;
                cot[j] = false;
                sum -= a[i][j];
            }
        }
    }

    public static void main(String[] args) {
        n = 8;
        a = new int[n + 1][n + 1];
        Try(1);
        System.out.println(max);
    }
}
