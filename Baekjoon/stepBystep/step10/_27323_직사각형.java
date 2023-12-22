package Baekjoon.stepBystep.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 23.12.22
// https://www.acmicpc.net/problem/27323
public class _27323_직사각형 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		System.out.println(a*b);
	}
}
