package Baekjoon.stepBystep.step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 23.10.25
// https://www.acmicpc.net/problem/10810
public class _10810_공넣기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] basket = new int[n];
		
		for(int l=0; l<m; l++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken()) - 1;
			int j = Integer.parseInt(st.nextToken()) - 1;
			int k = Integer.parseInt(st.nextToken());
			
			for(int o=i; o<=j; o++) {
				basket[o] = k;
			}
		}
		
		for(int p=0; p<n; p++) {
			System.out.print(basket[p] + " ");
		}

	}
}
