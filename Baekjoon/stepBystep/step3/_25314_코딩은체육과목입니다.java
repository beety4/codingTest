package Baekjoon.stepBystep.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 23.10.24
// https://www.acmicpc.net/problem/25314
public class _25314_코딩은체육과목입니다 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int repeat = n / 4;
		
		for(int i=0; i<repeat; i++) {
			System.out.print("long ");
		}
		System.out.println("int");

	}
}
