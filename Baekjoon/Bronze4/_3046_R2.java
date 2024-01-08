package Baekjoon.Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24.01.08
// https://www.acmicpc.net/problem/3046
public class _3046_R2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int r1 = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		
		System.out.println(2*s - r1);
	}
}
