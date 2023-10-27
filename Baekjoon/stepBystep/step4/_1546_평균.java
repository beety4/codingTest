package Baekjoon.stepBystep.step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 23.10.27
// https://www.acmicpc.net/problem/1546
public class _1546_평균 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int max = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		arr[0] = max;
		
		for(int i=1; i<n; i++) {
			int value = Integer.parseInt(st.nextToken());
			arr[i] = value;
			if(max < value) {
				max = value;
			}
		}
		
		double result = 0;
		for(int i=0; i<n; i++) {
			double aver = (double)arr[i] / (max*100);
			result += aver;
		}
		
		System.out.println((result*10000)/n);
		

	}
}
