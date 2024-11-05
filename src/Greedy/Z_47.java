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
public class Z_47 {

    public static void main(String[] args) {
        int sum = new Scanner(System.in).nextInt();
        int cnt7 = 0, cnt4 = 0;
        for (int i = sum / 7; i >= 0; i--) {
            if ((sum - i * 7) % 4 == 0) {
                cnt7 = i;
                cnt4 = (sum - i * 7) / 4;
                break;
            }
        }
        int ans = 0;
        if (cnt7 != 0 || cnt4 != 0) {
            for (int i = 1; i <= cnt4; i++) {
                ans = ans * 10 + 4;
            }
            for (int i = 1; i <= cnt7; i++) {
                ans = ans * 10 + 7;
            }
            System.out.println(ans);
        } else {
            System.out.println("No");
        }
    }
}
