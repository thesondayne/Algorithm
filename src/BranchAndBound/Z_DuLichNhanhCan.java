/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BranchAndBound;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Z_DuLichNhanhCan {

    static int cmin;
    static int n;
    static int c[][] = new int[100][100];
    static int X[] = new int[100];
    static boolean visited[] = new boolean[100];
    static int ans = Integer.MAX_VALUE;

    static void Try(int i, int dis) {
        for (int j = 1; j <= n; j++) {
            if (!visited[j]) {
                X[i] = j;
                visited[j] = true;
                dis += c[X[i - 1]][X[i]];
                if (i == n) {
                    ans = Math.min(ans, dis + c[X[n]][1]);
                } // cắt nhánh cận
                else if (dis + (n - i + 1) * cmin < ans) {
                    Try(i + 1, dis);
                }
                visited[j] = false;
                dis -= c[X[i - 1]][X[i]];
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                c[i][j] = sc.nextInt();
                if (c[i][j] > 0) {
                    cmin = Math.min(cmin, c[i][j]);
                }
            }
        }
        visited[1] = true;
        X[1] = 1;
        Try(2, 0);
        System.out.println(ans);
    }
}
