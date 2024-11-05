/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BranchAndBound;

/**
 *
 * @author Dell
 */
public class Z_TapConCoTong {
    // Cho vào một mảng, tìm tập con có tổng bằng một số n cho trước
    static int[] X = new int[100];
    static int sum = 0;
    static int[] a;
    static int target;

    public static void Try(int i) {
        for (int j : a) {
            if (sum + j <= target && j > X[i - 1]) {
                X[i] = j;
                sum += j;
                if (sum == target) {
                    for (int l = 1; l <= i; l++) {
                        System.out.print(X[l]);
                    }
                    System.out.println();
                } else {
                    Try(i + 1);
                }
                sum -= j;
            }
        }
    }

}
