/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BranchAndBound;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Z_RatsInAMaze2 {

    static int n;
    static int c[][] = new int[100][100];
    static String K = "";
    static boolean check = false;
    static int I[];
    static int J[];
    static String path [] = new String[]{"L","D","R","U"};
    static void Try(int i, int j) {
        if(i==n && j==n){
            System.out.println(K);
            check=true;
        }
        for(int x=0; x<I.length; x++){
            int is = i+I[x];
            int js = j+J[x];
            if(1<=is && is<=n && 1<=js && js<=n && c[is][js]==1){
                c[is][js]=0;
                K+=path[x];
                Try(is,js);
                c[is][js]=1;
                K=K.substring(0, K.length()-1);
            }
        }
    }

    public static void main(String[] args) {
        I = new int[]{0, 1, 0, -1};
        J = new int[]{-1, 0, 1, 0};
        c[1][1]=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                c[i][j] = sc.nextInt();
            }
        }
        Try(1, 1);
        if (!check) {
            System.out.println("No have path");
        }
    }
}
