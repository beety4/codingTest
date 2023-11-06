package Baekjoon.stepBystep.step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 23.11.05
// https://www.acmicpc.net/problem/2903
public class _2903_중앙이동알고리즘 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int square = 2;
		for(int i=0; i<n; i++) {
			square = square*2 -1;
		}
		System.out.println((int)Math.pow(square, 2));
	}
}
