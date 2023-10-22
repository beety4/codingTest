package Baekjoon.stepBystep.step1;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

// 23.10.22
// https://www.acmicpc.net/problem/10430
public class _10430_나머지 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		System.out.println((a+b)%c);
		System.out.println(((a%c) + (b%c))%c);
		System.out.println((a*b)%c);
		System.out.println(((a%c) * (b%c))%c);
		
	}

}
