package Baekjoon.stepBystep.step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 23.10.24
// https://www.acmicpc.net/problem/10951
public class _10951_A더하기B_4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String value = br.readLine();
			
			// 제출 시 ""이 아닌 null
			if(value == "") {
				break;
			}
			
			StringTokenizer st = new StringTokenizer(value);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			System.out.println(a + b);
		}
	}
}
