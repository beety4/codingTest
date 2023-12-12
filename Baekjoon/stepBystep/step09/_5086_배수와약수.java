package Baekjoon.stepBystep.step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 23.12.13
// https://www.acmicpc.net/problem/5086
public class _5086_배수와약수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = null;
		while((line = br.readLine()).charAt(0) != '0') {
			StringTokenizer st = new StringTokenizer(line);
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if((b%a) == 0) {
				System.out.println("factor");
			} else if((a%b) == 0) {
				System.out.println("multiple");
			} else {
				System.out.println("neither");
			}
		}
		
		
	}
}
