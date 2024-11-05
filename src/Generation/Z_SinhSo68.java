/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generation;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Z_SinhSo68 {

    static int[] X = new int[100];
    static int n = 1;
    static int cnt = 0;
    static boolean check = false;

    static void khoitao() {
        for (int i = 1; i <= n; i++) {
            X[i] = 6;
        }
        check = false;
    }

    static void sinh() {
        int i = n;
        while (i > 0 && X[i] == 8) {
            X[i] = 6;
            i--;
        }
        if (i == 0) {
            check = true;
        } else {
            X[i] = 8;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while (cnt < x) {
            khoitao();
            while (!check && cnt < x) {
                for (int i = 1; i <= n; i++) {
                    System.out.print(X[i]);
                }
                for (int i = n; i >= 1; i--) {
                    System.out.print(X[i]);
                }
                cnt++;
                System.out.println();
                sinh();
            }
            n++;
        }
    }

}
