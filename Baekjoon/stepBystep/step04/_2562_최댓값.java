package Baekjoon.stepBystep.step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 23.10.25
// https://www.acmicpc.net/problem/2562
public class _2562_최댓값 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = Integer.parseInt(br.readLine());
		int cnt = 1;
		int select = 1;
		
		String line = null;
		// 제출 시 ""이 아닌 null
		while((line = br.readLine()) != "") {
			cnt++;
			int x = Integer.parseInt(line);
			
			if(max < x) {
				max = x;
				select = cnt;
			}
		}
		
		System.out.println(max + "\n" + select);

	}
}
