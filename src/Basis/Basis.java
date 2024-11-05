/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basis;

import java.util.Arrays;

/**
 *
 * @author Dell
 */
public class Basis {
    //--------------------------------------------------------------------------
    // lũy thừa nhị phân (log 2 n)
    public static long binPow (long a, long b){
        if(b==0) return 1;
        long x = binPow(a, b/2);
        if(b%2==0) return x*x;
        return x*x*a;
    }
    //--------------------------------------------------------------------------
    // tính a^b chia dư cho c  (log 2 n)
    public static long binPow (long a, long b,long c){
        if(b==0) return 1;
        long x = binPow(a, b/2, c);
        if(b%2==0) return x%c*x%c;
        return x%c*x%c*a%c;
    }
    //--------------------------------------------------------------------------
    // sàng số nguyên tố
    public static void sangSoNguyenTo(int n){
        boolean [] prime = new boolean [n+1];
        for(int i=0; i<n+1; i++){
            prime[i] = true;
        }
        prime[0] = false;
        prime[1] = false;
        for(int i=2; i<Math.sqrt(n); i++){
            if(prime[i]==true){
                // có thê thay j = i+i
                for(int j=i+i; j<=n; j+=i){
                    prime[j]=false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(prime[i]==true){
                System.out.println(i);
            }
        }
    }
    //--------------------------------------------------------------------------
    public static void main(String[] args) {
        sangSoNguyenTo(100);
    }
}
