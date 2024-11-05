package Greedy;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Z_StringGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
            else {
                map.put(c, 1);
            }
        }
        Set<Character> set = map.keySet();
        int cnt=0;
        for (Character c : set) {
            if(map.get(c) %2 == 1) {
                cnt++;
            }
        }
        if(cnt<2) System.out.println("1");
        else {
            if(cnt%2==0) System.out.println("2");
            else System.out.println("1");
        }
    }
}
