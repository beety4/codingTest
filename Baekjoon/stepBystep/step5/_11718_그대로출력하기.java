package Baekjoon.stepBystep.step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 23.10.29
// https://www.acmicpc.net/problem/11718
public class _11718_그대로출력하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = "";
		// 이클립스 ide 에선 ""로 체크 , 코드 제출 시 null
		while((input = br.readLine()) != null) {
			System.out.println(input);
		}
	}
}
