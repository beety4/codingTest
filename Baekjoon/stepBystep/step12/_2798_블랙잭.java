package Baekjoon.stepBystep.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

// 23.12.27
// https://www.acmicpc.net/problem/2798
public class _2798_블랙잭 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Integer[] arr = new Integer[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		int j = 3;
		int k = 0;
		int result = 0;
		while(j != 0) {
			if(result + arr[k] <= m) {
				result += arr[k];
				j--;
				System.out.println(arr[k] + " // " + j);
			}
			
			if(k == n-1) {
				break;
			} else {
				k++;
			}
		}
		
		System.out.println(result);
	}

}
