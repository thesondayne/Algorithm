package DivideAndConquer;

import java.util.Scanner;

public class Z_So1DauTien {
    public static int find(int [] arr){
        int l=0;
        int r=arr.length-1;
        int res=-1;
        while(l<=r){
            int m=(l+r)/2;
            if(arr[m]==0){
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
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(find(arr));
    }
}
