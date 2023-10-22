package Baekjoon.stepBystep.step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 23.10.22
// https://www.acmicpc.net/problem/1330
public class _1330_두수비교하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		if(a > b) {
			System.out.println(">");
		} else if(a < b) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}

	}

}
