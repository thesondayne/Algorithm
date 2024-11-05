package DivideAndConquer;

import java.util.Scanner;

public class Z_XauFiBo {
    public static int fibo(int n) {
        if(n==1) return 1;
        else if(n==2) return 1;
        else return fibo(n-1) + fibo(n-2);
    }
    public static char fiboString(int n, int k){
        if(n==1) return 'A';
        else if(n==2) return 'B';
        else if(k>fibo(n-2)) return fiboString(n-1, k-fibo(n-2));
        else return fiboString(n-2, k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(fiboString(n,k));
    }
}
