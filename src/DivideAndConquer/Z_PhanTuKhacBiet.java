package DivideAndConquer;

import java.util.Scanner;

public class Z_PhanTuKhacBiet {
    public static int find(int [] A, int [] B, int n){
        int l=0;
        int r=n-2;
        int res=-1;
        while(l<=r){
            int m=(l+r)/2;
            if(A[m]==B[m]){
                l=m+1;
            }
            else{
                res=m;
                r=m-1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] A = new int[n];
        int [] B = new int[n-1];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            B[i] = sc.nextInt();
        }
        System.out.println(find(A,B,n)+1);
    }
}
