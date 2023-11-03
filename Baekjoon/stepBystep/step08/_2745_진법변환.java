package Baekjoon.stepBystep.step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 23.11.02
// https://www.acmicpc.net/problem/2745
public class _2745_진법변환 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String input = st.nextToken();
		int radix = Integer.parseInt(st.nextToken());
		
		long a = 0;
		for(int i=0; i<input.length(); i++) {
			if(Character.isDigit(input.charAt(i))) {
				a += input.charAt(i);
			} else {
				a += (long)(input.charAt(i) - 55);
			}

		}
		
		System.out.println(a);
	}
}
