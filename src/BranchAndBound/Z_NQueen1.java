/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BranchAndBound;

/**
 *
 * @author Dell
 */
public class Z_NQueen1 {

    static int n;
    static int X[] = new int[100];
    static boolean xuoi[] = new boolean[100];
    static boolean nguoc[] = new boolean[100];
    static boolean cot[] = new boolean[100];

    public static void Try(int i) {
        for (int j = 1; j <= n; j++) {
            if (!xuoi[n + i - j] && !nguoc[i + j - 1] && !cot[j]) {
                X[i] = j;
                xuoi[n + i - j] = true;
                nguoc[i + j - 1] = true;
                cot[j] = true;
                if (i == n) {
                    for (int l = 1; l <= n; l++) {
                        System.out.print(X[l]);
                    }
                    System.out.println();
                } else {
                    Try(i + 1);
                }
                xuoi[n + i - j] = false;
                nguoc[i + j - 1] = false;
                cot[j] = false;
            }
        }
    }

    public static void main(String[] args) {
        n = 5;
        Try(1);
    }
}
