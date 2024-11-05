package Greedy;

import java.util.Scanner;

public class Z_SVaD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int d = sc.nextInt();
        int [] X = new int [d];
        if(d*9<s) System.out.println(-1);
        else{
            int i=0;
            while (s>9){
                X[i]=9;
                i++;
                s-=9;
            }
            if(i==d-1){
                X[i]=s;
            }
            else{
                X[i]=s-1;
                X[d-1]=1;
            }

        }
        for(int i=d-1; i>=0; i--){
            System.out.print(X[i]);
        }
    }
}
