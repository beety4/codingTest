package Baekjoon.stepBystep.step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 23.12.19
// https://www.acmicpc.net/problem/1978
public class _1979_소수찾기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int repeat = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int result = 0;
		for(int i=0; i<repeat; i++) {
			int n = Integer.parseInt(st.nextToken());
			
			boolean check = true;
			for(int j=2; j<n; j++) {
				if(n%j == 0) {
					check = false;
					break;
				}
			}
			
			if(check && n != 1) {
				result++;
			}
		}
		
		System.out.println(result);
		
	}
}
