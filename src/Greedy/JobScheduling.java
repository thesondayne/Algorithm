/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class JobScheduling {

    public static void main(String[] args) {
        // Có lịch chiếu của các bộ phim và kiếm cách xem được nhiều bộ phim nhất
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<ArrayList<Integer>> li = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> tmp = new ArrayList<>();
            int x = sc.nextInt();
            int y = sc.nextInt();
            tmp.add(x);
            tmp.add(y);
            li.add(tmp);
        }
        li.sort((o1, o2) -> o1.get(1) - o2.get(1));
        int cnt = 1;
        int idx = li.get(0).get(1);
        for (int i = 1; i < li.size(); i++) {
            if (li.get(i).get(0) > idx) {
                cnt++;
                idx = li.get(i).get(1);
            }
        }
        System.out.println(cnt);
    }

}
