package Greedy;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Z_Tich3So {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        while(n>1){
            for(int i=2;i<=n;i++) {
                if(n%i==0){
                    st.push(i);
                    n/=i;
                    break;
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        boolean flag = false;
        int cnt=0;
        while(!st.isEmpty()){
            if(!list.contains(st.peek())){
                cnt++;
                list.add(st.peek());
                st.pop();
            }
            else {
                int a = st.pop();
                if(st.isEmpty()) break;
                else {
                    int b = st.pop();
                    st.push(a*b);
                }
            }
            if(cnt==3){
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
}
