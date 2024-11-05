/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SortAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Z_BaiToanXepGach {
    // Cho các viên gạch và có chỉ số chịu đựng của nó (đặt được bao nhiêu viên gạch ở trên nó
    // Tìm cách xếp được nhiều viên gạch nhất
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] X = new int[n];
        for (int i = 0; i < n; i++) {
            X[i] = sc.nextInt();
        }
        Arrays.sort(X);
        int cnt = 0;
        int min = 1000000;
        for (int i = X.length - 1; i >= 0; i--) {
            cnt++;
            min = Math.min(min - 1, X[i]);
            if (min == 0) {
                break;
            }
        }
        System.out.println(cnt);

    }
}
