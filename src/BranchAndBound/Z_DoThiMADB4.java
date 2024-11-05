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
public class Z_DoThiMADB4 {
    
    static int n;
    static int c[][] = new int[100][100];
    static int X[] = new int[100];
    static boolean visited[] = new boolean[100];
    static boolean check = false;

    static int UCLN(int a, int b) {
        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        if (a % b == 0) {
            return b;
        }
        return UCLN(b, a % b);
    }

    static boolean checkNTCN(int a, int b) {
        if (UCLN(a, b) == 1) {
            return true;
        }
        return false;
    }

    static void khoiTaoMaTran() {
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= n; j++) {
                if (checkNTCN(i, j)) {
                    c[i][j] = 1;
                } else {
                    c[i][j] = 0;
                }
            }
        }
//        for (int i = 2; i <= n; i++) {
//            for (int j = 2; j <= n; j++) {
//                System.out.print(c[i][j] + " ");
//            }
//            System.out.println();
//        }
    }

    static void Try(int i) {
        for (int j = 3; j <= n; j++) {
            if (!visited[j] && c[X[i - 1]][j] == 1) {
                X[i] = j;
                visited[j] = true;
                if (i == n) {
                    if (c[X[i]][2] == 1) {
                        check = true;
//                        for (int l = 2; l <= n; l++) {
//                            System.out.print(X[l] + " ");
//                        }
//                        System.out.println();
                    }
                } else {
                    Try(i + 1);
                }
                visited[j] = false;
            }
        }
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        visited[2] = true;
        X[2] = 2;
        int cnt = 0;
        for (int i = 8; i <= 10; i++) {
            check = false;
            n = i;
            khoiTaoMaTran();
            Try(3);
            if (check) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
