package Baekjoon.stepBystep.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 23.12.24
// https://www.acmicpc.net/problem/10101
public class _10101_삼각형외우기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		if(a == 60 && b == 60 && c == 60) {
			System.out.println("Equilateral");
			return;
		}
		
		if(a+b+c == 180) {
			if(a == b || b == c || c == a) {
				System.out.println("Isosceles");
			} else {
				System.out.println("Scalene");
			}
		} else {
			System.out.println("Error");
		}

	}

}
