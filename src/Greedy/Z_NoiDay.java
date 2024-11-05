/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Greedy;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Z_NoiDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> a = new PriorityQueue<>();
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            a.add(x);
        }
        int ans = 0;
        while(a.size()>1){
            int i = a.poll();
            int j = a.poll();
            ans+=(i+j);
            a.add(i+j);
        }
        System.out.println(ans);
    }
}
