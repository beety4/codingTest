package Baekjoon.stepBystep.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24.02.06
// https://www.acmicpc.net/problem/1436
public class _1436_영화감독숌 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int i = 666;
		while(n != 0) {
			if(Integer.toString(i).contains("666")) {
				n--;
			}
			i++;
		}
		
		System.out.println(i-1);
		
	}

}
