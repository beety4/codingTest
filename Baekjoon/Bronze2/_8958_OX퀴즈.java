package Baekjoon.Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24.01.09
// https://www.acmicpc.net/problem/8958
public class _8958_OX퀴즈 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			String input = br.readLine();
			
			int result = 0;
			int cnt = 1;
			char pre = '-';
			for(int j=0; j<input.length(); j++) {
				char current = input.charAt(j);
				if(current == pre && current == 'O') {
					cnt++;
				} else {
					if(current == 'O') {
						cnt = 1;
					} else {
						cnt = 0;
					}
				}
				pre = current;
				result += cnt;
			}
			System.out.println(result);
		}
	}

}
