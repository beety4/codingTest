package Baekjoon.stepBystep.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24.02.10
// https://www.acmicpc.net/problem/2839
public class _2839_설탕배달 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int a =  n / 5;
		int b = n % 5;
		
		int other = 0;
		if(b != 0) {
			for(int i=a; i>=-1; i--) {
				System.out.println(i);
				int c = n - 5*(i+1);
				
				if(c%3 == 0) {
					a = i + 1;
					other = c / 3;
					break;
				}
			}
		}

		System.out.println("a : " + a + " // other : " + other);
		System.out.println(a+other == 0 ? -1 : a + other);

	}
}
