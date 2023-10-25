package Baekjoon.stepBystep.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 23.10.24
// https://www.acmicpc.net/problem/2739
public class _2739_구구단 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		
		for(int i=1 ;i<=9; i++) {
			System.out.println(a + " * " + i + " = " + a*i);
		}
	}

}
