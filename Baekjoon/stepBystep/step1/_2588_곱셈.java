package Baekjoon.stepBystep.step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 23.10.22
// https://www.acmicpc.net/problem/2588
public class _2588_곱셈 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		String b = br.readLine();
		
		int var = 0;
		int sum = 0;
		for(int i=b.length()-1; i>=0; i--) {
			var = Character.getNumericValue(b.charAt(i));
			System.out.println(a * var);
			sum += var * a * Math.pow(10,  b.length() - 1 - i);
		}
		
		System.out.println(sum);
	}

}
