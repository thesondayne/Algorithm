/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SortAlgorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Dell
 */
public class Z_CuaHangDongDuc {

    public static void main(String[] args) {
        // Cho n khách hàng và nhập vào giờ họ đến và giờ học đi
        // In ra số khách hàng đông nhất trong cùng một thời điểm
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a;
        int b;
        Map<Integer, Integer> check = new HashMap<>();
        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            if (check.containsKey(a)) {
                check.put(a, check.get(a) + 1);
            } else {
                check.put(a, 1);
            }
            if (check.containsKey(b)) {
                check.put(b, check.get(b) - 1);
            } else {
                check.put(b, -1);
            }
        }
        int cnt = 0;
        int max = 0;
        Set<Integer> key = check.keySet();
        for (int x : key) {
            cnt += check.get(x);
            if (cnt < 0) {
                cnt = 0;
            }
            if (cnt > max) {
                max = cnt;
            }

        }
        System.out.println(max);

    }
}
