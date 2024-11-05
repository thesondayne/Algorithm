/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SearchAlgorithm;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class ChatNhiPhanKetQua {
    // Tìm kiếm nhị phân (Binary Search) O(log n)
    // Phải sắp xếp trước khi tìm kiếm
    public static boolean check(int n, int length, int width, int target){
        if((target/length)*(target/width)>=n) return true;
        return false;
    }
    public static int binarySearch(int n, int length, int width) {
        int result=0;
        int left = 0;
        int right = 100;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (check(n,length,width,mid)) {
                right=mid-1;
                result=mid;
            } else {
                left=mid+1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int n=5;
        int [] a = new int [] {1,4,2,3,1,-1,7,4,1,2,-2,5,3};
        int tmp=0;
        int cnt=0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<a.length;i++){
            arr.add(tmp);
            tmp+=a[i];
            if(arr.contains(tmp-n)){
                for(int x:arr){
                    if(x==tmp-n) cnt++;
                }
                
            }
        }
        System.out.println(cnt);
    }
}
