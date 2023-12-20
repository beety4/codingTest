package Baekjoon.stepBystep.step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 23.12.20
// https://www.acmicpc.net/problem/2581
public class _2581_소수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		int min = 0;
		int sum = 0;
		for(int i=n; i>=m; i--) {
			System.out.println(i);
			boolean check = true;
			for(int j=2; j<i; j++) {
				if(i%j == 0) {
					check = false;
					break;
				}
			}
			
			if(check && i != 1) {
				min = i;
				sum += i;
			}
		}
		
		if(sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}

	}

}
