package Baekjoon.stepBystep.step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 23.12.13
// https://www.acmicpc.net/problem/2501
public class _2501_약수구하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		for(int i=1; i<=n; i++) {
			if(n%i == 0) {
				k--;
			}
			if(k == 0) {
				System.out.println(i);
				return;
			}
		}
		
		System.out.println(0);

	}
}
