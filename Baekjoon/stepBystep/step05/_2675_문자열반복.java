package Baekjoon.stepBystep.step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 23.10.28
// https://www.acmicpc.net/problem/2675
public class _2675_문자열반복 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int plus = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			
			for(int j=0; j<s.length(); j++) {
				for(int k=0; k<plus; k++) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}

	}
}
