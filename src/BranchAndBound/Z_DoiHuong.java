package BranchAndBound;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Z_DoiHuong {
    // 1 la đi được
    // 0 là vật cản
    // 2 là điểm bắt đầu
    // 3 là điểm kết thúc
    static int n;
    static int m;
    static int[][] matrix;
    static boolean[][] visited;
    static boolean check = false;
    static int xEnd;
    static int yEnd;
    static int[] X = new int[]{1, -1, 0, 0};
    static int[] Y = new int[]{0, 0, -1, 1};
    static Stack<Integer> stack = new Stack<>();
    static void Try(int i, int j, int count) {
        if(i == xEnd && j == yEnd) {
            check = true;
            for (int x : stack){
                System.out.print(x + " ");
            }
            return;
        }
        for(int k = 0; k<X.length; k++) {
            if(i + X[k] > -1 && j + Y[k] > -1 && i + X[k] < n && j + Y[k] < m && !visited[i + X[k]][j + Y[k]] && (matrix[i + X[k]][j + Y[k]] == 1 || matrix[i + X[k]][j + Y[k]] == 3)) {
                if(k != stack.peek() && count < 2) {
                    stack.push(k);
                    visited[i + X[k]][j + Y[k]] = true;
                    Try(i + X[k], j + Y[k], count + 1);
                    stack.pop();
                    visited[i + X[k]][j + Y[k]] = false;
                }
                else if(k == stack.peek() && count <= 2) {
                    stack.push(k);
                    visited[i + X[k]][j + Y[k]] = true;
                    Try(i + X[k], j + Y[k], count);
                    stack.pop();
                    visited[i + X[k]][j + Y[k]] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        matrix = new int[n][m];
        visited = new boolean[n][m];
        for (boolean[] row : visited) {
            Arrays.fill(row, false);
        }
        stack.push(-1);
        int xStart = 0, yStart = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = in.nextInt();
                if (matrix[i][j] == 3) {
                    xEnd = i;
                    yEnd = j;
                }
                if (matrix[i][j] == 2) {
                    xStart = i;
                    yStart = j;

                }
            }
        }
        visited[xStart][yStart] = true;
        Try(xStart, yStart, -1);
        if(check) System.out.println("Yes");
        else System.out.println("No");
    }
}
