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
		
		// 체스판 입력
		String[] lines = new String[n];
		for(int i=0; i<n; i++) {
			lines[i] = br.readLine();
		}
		
		// 8x8의 가능한 모든 체스판 경우의 수 검색
		int min = 33;
		for(int i=0; i<n-7; i++) {
			int s1 = i;
			int e1 = i+8;
			
			for(int j=0; j<m-7; j++) {
				int s2 = j;
				int e2 = j+8;
				
				int cnt = 0;
				char pre = lines[0].charAt(0) == 'W' ? 'B' : 'W';
				for(int k=s1; k<e1; k++) {
					for(int l=s2; l<e2; l++) {
						char now = lines[k].charAt(l);
						if((l == 0 && now != pre) || now == pre) {
							cnt++;
						} 
						
						
						//if(k%8 != 0 && now == pre) {
						//	System.out.println("s1 : " + k + " // s2 : " + l);
						//	cnt++;
						//}
						pre = now;
					}
				}
				
				min = (cnt < min) ? cnt : min;
			}
		
			System.out.println(min);
		
		}
	}
}