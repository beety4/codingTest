package Baekjoon.Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24.01.07
// https://www.acmicpc.net/problem/10824
public class _10824_네수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long a = Long.parseLong(st.nextToken() + st.nextToken());
		long b = Long.parseLong(st.nextToken() + st.nextToken());
		
		System.out.println(a+b);
	}
}
