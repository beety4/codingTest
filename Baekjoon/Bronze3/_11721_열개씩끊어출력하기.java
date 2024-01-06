package Baekjoon.Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24.01.06
// https://www.acmicpc.net/problem/11721
public class _11721_열개씩끊어출력하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		int per = n.length() / 10;
		
		for(int i=0; i<=per; i++) {
			int start = i * 10;
			int end = ((i+1)*10 < n.length()) ? (i + 1) * 10 : n.length();
			System.out.println(n.substring(start, end));
		}
	}
}
