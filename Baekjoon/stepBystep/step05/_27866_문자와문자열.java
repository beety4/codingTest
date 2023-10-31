package Baekjoon.stepBystep.step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 23.10.27
// https://www.acmicpc.net/problem/27866
public class _27866_문자와문자열 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int i = Integer.parseInt(br.readLine());
		
		System.out.println(s.charAt(i-1));

	}
}
