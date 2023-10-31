package Baekjoon.stepBystep.step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 23.10.30
// https://www.acmicpc.net/problem/10988
public class _10988_팰린드롬인지확인하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String original = br.readLine();
		
		StringBuilder sb = new StringBuilder(original);
		String reverse = sb.reverse().toString();
		
		System.out.println(original.equals(reverse) ? 1 : 0);
	}
}
