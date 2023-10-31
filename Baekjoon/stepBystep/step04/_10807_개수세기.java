package Baekjoon.stepBystep.step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 23.10.24
// https://www.acmicpc.net/problem/10807
public class _10807_개수세기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int findNum = Integer.parseInt(br.readLine());
		int cnt = 0;
		for(int i=0; i<n; i++) {
			if(arr[i] == findNum) {
				cnt++;
			}
		}
		
		System.out.println(cnt);

	}
}
