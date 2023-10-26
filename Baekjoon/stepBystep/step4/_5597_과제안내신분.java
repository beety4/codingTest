package Baekjoon.stepBystep.step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 23.10.26
// https://www.acmicpc.net/problem/5597
public class _5597_과제안내신분 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[30];
		for(int i=0; i<28; i++) {
			int input = Integer.parseInt(br.readLine());
			arr[input-1] = input;
		}
		
		for(int i=0; i<30; i++) {
			if(arr[i] == 0) {
				System.out.println(i+1);
			}
		}

	}
}
