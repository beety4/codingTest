package Baekjoon.stepBystep.step1;

import java.util.Scanner;
import java.math.BigDecimal;

// 23.10.22
// https://www.acmicpc.net/problem/1008
// [주의사항] JAVA 제출시 클래스 이름은 Main 이여야 함.
public class _1008_A나누기B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		sc.close();
		
		BigDecimal a = new BigDecimal(input[0]);
		BigDecimal b = new BigDecimal(input[1]);

		System.out.println(a.divide(b, 10, BigDecimal.ROUND_DOWN));
	}

}
