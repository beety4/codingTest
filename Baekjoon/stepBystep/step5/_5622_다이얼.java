package Baekjoon.stepBystep.step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 23.10.29
// https://www.acmicpc.net/problem/5622
public class _5622_다이얼 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int sum = 0;
		for(int i=0; i<input.length(); i++) {
			int a = input.charAt(i) - 65;
			if(a == 18) {
				sum += 8;
			} else if(a == 21) {
				sum += 9;
			} else if(a >= 22) {
				sum += 10;
			} else {
				sum += (a / 3) + 3;
			}
		}
		
		System.out.println(sum);
	}
}
