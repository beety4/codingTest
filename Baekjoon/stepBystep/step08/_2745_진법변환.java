package Baekjoon.stepBystep.step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24.01.09
// https://www.acmicpc.net/problem/2745
public class _2745_진법변환 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String input = st.nextToken();
		int radix = Integer.parseInt(st.nextToken());
		
		System.out.println(Integer.parseInt(input, radix));
	}
}
