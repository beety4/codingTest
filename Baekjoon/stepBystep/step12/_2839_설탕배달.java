package Baekjoon.stepBystep.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24.02.11
// https://www.acmicpc.net/problem/2839
public class _2839_설탕배달 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		
		int test = n / 3;
		int min = 9999;
		for(int i=0; i<=test; i++) {
			int ab = n - 3*i;
			
			if(ab%5 == 0) {
				int cnt = ab/5 + i;
				min = cnt < min ? cnt : min;
			}
		}
		
		System.out.println(min == 9999 ? -1 : min);
	}
}
