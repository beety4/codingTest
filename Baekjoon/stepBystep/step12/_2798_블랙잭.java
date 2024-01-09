package Baekjoon.stepBystep.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24.01.09
// https://www.acmicpc.net/problem/2798
public class _2798_블랙잭 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Integer[] arr = new Integer[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = 0;
		for(int j=0; j<n; j++) {
			for(int k=0; k<j; k++) {
				for(int l=0; l<k; l++) {
					int sum = arr[j] + arr[k] + arr[l];
					if(sum <= m && sum > max) {
						max = sum;
					}
				}
			}
		}
		
		System.out.println(max);
	}
}
