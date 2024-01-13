package Baekjoon.stepBystep.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24.01.13
// https://www.acmicpc.net/problem/2231
public class _2231_분해합 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int n = Integer.parseInt(input);
		
		boolean chk = true;
		for(int i=0; i<n; i++) {
			String num = Integer.toString(i);
			int sum = 0;
			for(int j=0; j<num.length(); j++) {
				int on = Character.getNumericValue(num.charAt(j));
				sum += on;
			}
			
			if(i+sum == n) {
				chk = false;
				System.out.println(num);
				break;
			}
		}
		
		if(chk) {
			System.out.println(0);
		}
	}

}
