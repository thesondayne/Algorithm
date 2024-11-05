package Greedy;

import java.util.Scanner;

public class Z_DiCho {
    public static int diCho(int n, int s, int m){
        if(n<m) return -1;
        if(s<7){
            if(s*m % n ==0) return s*m/n;
            return s*m/n+1;
        }

        if(m*6<m*7) return -1;
        if(s*m % n ==0) return s*m/n;
        return s*m/n+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int s = Integer.parseInt(sc.nextLine());
        int m = Integer.parseInt(sc.nextLine());
        System.out.println(diCho(n,s,m));
    }
}
