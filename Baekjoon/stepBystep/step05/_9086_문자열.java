package Baekjoon.stepBystep.step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 23.10.27
// https://www.acmicpc.net/problem/9086
public class _9086_문자열 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int t = Integer.parseInt(br.readLine());
		for(int i=0; i<t; i++) {
			StringBuilder sb = new StringBuilder();
			String s = br.readLine();
			int last = s.length() - 1;
			sb.append(s.charAt(0)).append(s.charAt(last));
			System.out.println(sb.toString());
		}

	}
}
