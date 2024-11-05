/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Greedy;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Z_XepLaiChuThamLam {

    public static void main(String[] args) {
        int max = 0;
        String s = new Scanner(System.in).nextLine();
        int a[] = new int[1000];
        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i)]++;
            if (a[s.charAt(i)] > max) {
                max = a[s.charAt(i)];
            }
        }
        if (s.length() % 2 == 0) {
            if (max <= s.length() / 2) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            if (max <= s.length() / 2 + 1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
