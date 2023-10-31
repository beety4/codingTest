package Baekjoon.stepBystep.step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 23.10.31
// https://www.acmicpc.net/problem/1316
public class _1316_그룹단어체커 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int cnt = n;
		for(int i=0; i<n; i++) {
			String input = br.readLine();
			
			char pre = (char)(input.charAt(0) - 97);
			int[] arr = new int[26];
			for(int j=0; j<input.length(); j++) {
				int value = input.charAt(j) - 97;
				if(arr[value] == 1 && pre == value) {
					
				} else if(arr[value] == 1) {
					cnt--;
					break;
				} else {
					arr[value] = 1;
				}
				
				pre = (char)value;
			}
			
		}
		System.out.println(cnt);
		
	}
}
