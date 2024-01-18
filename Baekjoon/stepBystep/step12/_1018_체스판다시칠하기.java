package Baekjoon.stepBystep.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24.01.18
// https://www.acmicpc.net/problem/1018
public class _1018_체스판다시칠하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int add = 1;
		char[] board = new char[64];
//		for(int i=1; i<=n; i++) {
//			String line = br.readLine();
//			for(int j=0; j<m; j++) {
//				board[i*add + j] = line.charAt(j-1);
//			}
//			add++;
//		}
		
		//System.out.println(chkBoard(board, n, m));
		
		for(int k=0; k<n; k++) {
			for(int l=0; l<m; l++) {
				System.out.print(k*8 + l + " ");
			}
			add++;
		}
	}
	
	public static int chkBoard(char[] board, int n, int m) {
		int cnt = 0;
		char pre = board[0] == 'W' ? 'W' : 'B';
		for(int i=0; i<n*m; i++) {
			if(board[i] == pre) {
				cnt++;
				System.out.print(board[i]);
			}
			pre = board[i] == 'W' ? 'B' : 'W';
		}
		return cnt;
	}

}
