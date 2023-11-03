package Baekjoon.stepBystep.step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 23.11.02
// https://www.acmicpc.net/problem/2563
public class _2563_색종이 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		boolean[][] arr = new boolean[100][100];
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			for(int j=x; j<x+10; j++) {
				for(int k=y; k<y+10; k++) {
					arr[j][k] = true;
				}
			}
		}
		
		int cnt = 0;
		for(int j=0; j<100; j++) {
			for(int k=0; k<100; k++) {
				if(arr[j][k] == true) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);

	}

}
