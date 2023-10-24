package Baekjoon.stepBystep.step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 23.10.24
// https://www.acmicpc.net/problem/2753
public class _2753_윤년 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		
		if((input % 4 == 0 && input % 100 != 0) || input % 400 == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

}
