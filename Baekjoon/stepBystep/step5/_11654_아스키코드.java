package Baekjoon.stepBystep.step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 23.10.28
// https://www.acmicpc.net/problem/11654
public class _11654_아스키코드 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char s = br.readLine().charAt(0);
		
		System.out.println((int)s);
	}
}
