package Baekjoon.stepBystep.step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 23.10.30
// https://www.acmicpc.net/problem/1157
public class _1157_단어공부 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine().toUpperCase();
		
		int[] arr = new int[26];
		for(int i=0; i<input.length(); i++) {
			int value = input.charAt(i) - 65;	
			arr[value] += 1;
		}

		int max = arr[0];
		int result = 0;
		for(int i=0; i<26; i++) {
			if(max < arr[i]) {
				max = arr[i];
				result = i;
			}
		}
		
		arr[result] = 0;
		for(int i=0; i<26; i++) {
			if(arr[i] == max) {
				System.out.println("?");
				return;
			}
		}
		
		System.out.println((char)(result+65));
		
	}
}
