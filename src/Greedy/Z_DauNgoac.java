package Greedy;

import java.util.Scanner;
import java.util.Stack;

public class Z_DauNgoac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> stack = new Stack<Character>();
        int cnt=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==')'){
                if(stack.isEmpty()){
                    cnt++;
                }
                else{
                    stack.pop();
                }
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        System.out.println(cnt);
    }
}
