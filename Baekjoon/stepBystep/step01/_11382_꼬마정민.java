package Baekjoon.stepBystep.step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 23.10.22
// https://www.acmicpc.net/problem/11382
public class _11382_꼬마정민 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long result = Long.parseLong(st.nextToken()) +
					  Long.parseLong(st.nextToken()) +
					  Long.parseLong(st.nextToken());
		
		System.out.println(result);
	
	}

}
