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
public class Z_RatsInAMaze1 {

    static int n;
    static int c[][] = new int[100][100];
    static String K = "";
    static boolean check = false;

    static void Try(int i, int j) {
        if (i == n && j == n) {
            check = true;
            System.out.println(K);
        }
        if (c[i + 1][j] == 1 && i + 1 <= n) {
            K += "D";
            c[i + 1][j] = 0;
            Try(i + 1, j);
            c[i + 1][j] = 1;
            K = K.substring(0, K.length() - 1);
        }
        if (c[i][j + 1] == 1 && j + 1 <= n) {
            K += "R";
            c[i][j + 1] = 0;
            Try(i, j + 1);
            c[i][j + 1] = 1;
            K = K.substring(0, K.length() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                c[i][j] = sc.nextInt();
            }
        }
        c[1][1]=0;
        Try(1, 1);
        if (!check) {
            System.out.println("No have path");
        }
    }
}
