package DivideAndConquer;

import java.util.Scanner;

public class Z_SauDoiXungSo {
    public static int soHang(int n){
        if(n==1) return 1;
        else return soHang(n-1)*2+1;
    }
    public static int find(int n, int k){
        if(k==soHang(n)/2+1) return n;
        else return find(n-1,Math.abs(k-(soHang(n-1)+1)));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(find(n,k));
    }}
