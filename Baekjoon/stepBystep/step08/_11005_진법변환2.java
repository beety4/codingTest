package Baekjoon.stepBystep.step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24.01.11
// https://www.acmicpc.net/problem/11005
public class _11005_진법변환2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int i = 0;
		while(n % b >= 1) {
			n /= b;
			i++;
			System.out.println(n/b);
		}
		
		for(int j=0; j<=i; j++) {
			System.out.print((char)(b+54));
		}
		//System.out.println(n);
		//System.out.println(n == b-1 ? "" : n);

	}

}
