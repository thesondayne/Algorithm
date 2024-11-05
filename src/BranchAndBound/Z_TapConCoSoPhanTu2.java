/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BranchAndBound;

/**
 *
 * @author Dell
 */
public class Z_TapConCoSoPhanTu2 {
    static int n;
    static int k;
    static int cnt=0;
    static int s;
    static int X [] = new int [100];
    public static void Try(int i, int bd, int sum){
        for(int j = bd; j<=n; j++){
            X[i]=j;
            if(i==k){
                if(sum+j==s) cnt++;
            }
            else{
                Try(i+1, j+1, sum+j);
            }
        }
    }   
    public static void main(String[] args) {
        n = 16;
        k=8;
        s=91;
        Try(1,1,0);
        System.out.println(cnt);
    }
}
