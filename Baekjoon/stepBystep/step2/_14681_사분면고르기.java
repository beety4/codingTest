package Baekjoon.stepBystep.step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 23.10.24
// https://www.acmicpc.net/problem/14681
public class _14681_사분면고르기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		
		if(x > 0) {
			if(y > 0) {
				System.out.println(1);
			} else {
				System.out.println(4);
			}
		} else {
			if(y > 0) {
				System.out.println(2);
			} else {
				System.out.println(3);
			}
		}
		
	}

}
