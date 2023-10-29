package Baekjoon.stepBystep.step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 23.10.29
// https://www.acmicpc.net/problem/2908
public class _2908_상수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		StringBuffer sb = new StringBuffer(st.nextToken());
		int a = Integer.parseInt(sb.reverse().toString());
		
		sb = new StringBuffer(st.nextToken());
		int b = Integer.parseInt(sb.reverse().toString());
		
		System.out.println((a>b) ? a : b);

	}
}
