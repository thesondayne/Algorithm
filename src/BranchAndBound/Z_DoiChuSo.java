package BranchAndBound;

import java.util.Scanner;

public class Z_DoiChuSo {
    static int k;
    static String s;
    static char[] X;
    static void Try(int i, char [] X, int cnt){
        if(cnt>k || i>X.length-1) return;
        char max = X[i];
        for(int j=i+1; j<X.length; j++){
            if(X[j]>max){
                max = X[j];
            }
        }
        if(X[i]==max){
            Try(i+1, X, cnt+1);
        }
        else {
            for(int j=i+1; j<X.length; j++){
                if(X[j]==max){
                    char tmp = X[i];
                    X[i] = X[j];
                    X[j] = tmp;
                    Try(i+1, X, cnt+1);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        k = Integer.parseInt(sc.nextLine());
        s = sc.nextLine();
        X=s.toCharArray();
        Try(0,X,1);
        for (char x : X) {
            System.out.print(x);
        }
    }
}
