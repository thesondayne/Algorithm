/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class JobSchedulingProfit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<ArrayList<Integer>> li = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> tmp = new ArrayList<>();
            int deadline = sc.nextInt();
            int profit = sc.nextInt();
            tmp.add(deadline);
            tmp.add(profit);
            li.add(tmp);
        }
        li.sort((o1, o2) -> o2.get(0) - o1.get(0));
        int cnt = li.get(0).get(0);
        // Hàng đợi ưu tiên theo thứ tự từ bé đến lớn -> Truyền vào Comparator;
        PriorityQueue<Integer> prf = new PriorityQueue<>((o1, o2) -> o2 - o1);
        int maxPrf = 0;
        while (cnt > 0) {
            for (ArrayList<Integer> a : li) {
                if (a.get(0) == cnt) {
                    prf.add(a.get(1));

                }
            }
            if (!prf.isEmpty()) {
                maxPrf += prf.poll();
            }

            cnt--;
        }
        System.out.println(maxPrf);
    }
}
