/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Greedy;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Dell
 */
public class Z_BinhPhuongChuSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character, Integer> a = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (a.containsKey(s.charAt(i))) {
                a.put(s.charAt(i), a.get(s.charAt(i)) + 1);
            } else {
                a.put(s.charAt(i), 1);
            }
        }
        PriorityQueue<Integer> q = new PriorityQueue<>((o1, o2) -> o2 - o1);
        Set<Character> keys = a.keySet();
        for (Character key : keys) {
            q.add(a.get(key));
        }
        int K = sc.nextInt();
        while (K > 0) {
            int x = q.poll();
            x--;
            q.add(x);
            K--;
        }
        int sum = 0;
        for (int i : q) {
            sum += i * i;
        }
        System.out.println(sum);
    }
}
