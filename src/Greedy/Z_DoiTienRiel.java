/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Greedy;

/**
 *
 * @author Dell
 */
public class Z_DoiTienRiel {
    // Tớ lớn hơn không nhỏ hơn 2 lần tờ bé hơn
    static int money [] = new int []{500,200,100,50,20,10,5,2,1};
    static int ans (int n){
        int ans=0;
        int cnt=0;
        while(n!=0){
            ans+=n/money[cnt];
            n=n%money[cnt];
            cnt++;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(ans(217));
    }
}
