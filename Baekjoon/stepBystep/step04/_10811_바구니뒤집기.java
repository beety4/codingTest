package Baekjoon.stepBystep.step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 23.10.26
// https://www.acmicpc.net/problem/10811
public class _10811_바구니뒤집기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		for(int o=0; o<n; o++) {
			arr[o] = o+1;
		}
		
		for(int o=0; o<m; o++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken()) - 1;
			int j = Integer.parseInt(st.nextToken()) - 1;
			int max = i;
			
			int[] tmp = Arrays.copyOf(arr, n);
			
			for(int p=j; p>=max; p--) {
				arr[i++] = tmp[p];
			}
		}

		for(int o=0; o<n; o++) {
			System.out.print(arr[o] + " ");
		}
	}
}
