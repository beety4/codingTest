package Baekjoon.stepBystep.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

// 24.02.20
// https://www.acmicpc.net/problem/1427
public class _1427_소트인사이드 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
	
		Integer[] arr = new Integer[n.length()];
		for(int i=0; i<n.length(); i++) {
			arr[i] = Character.getNumericValue(n.charAt(i));
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		for(int a : arr) {
			System.out.print(a);
		}	
	}
}
