package Baekjoon.stepBystep.step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 23.10.28
/// https://www.acmicpc.net/problem/11720
public class _11720_숫자의합 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int sum = 0;
		String s = br.readLine();
		for(int i=0; i<n; i++) {
			int val = Character.getNumericValue(s.charAt(i));
			sum += val;
		}
		
		System.out.println(sum);

	}
}
