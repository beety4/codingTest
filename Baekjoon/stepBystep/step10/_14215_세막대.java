package Baekjoon.stepBystep.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 23.12.24
// https://www.acmicpc.net/problem/14215
public class _14215_세막대 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int comp = 0;
		int max = 0;
		int[] data = new int[3];
		for(int i=0; i<3; i++) {
			data[i] = Integer.parseInt(st.nextToken());
			if(data[i] > max) {
				max = data[i];
				comp = i;
			}
		}
		
		while(data[0] + data[1] + data[2] - data[comp] <= data[comp]) {
			data[comp] -= 1;
		}
		
		System.out.println(data[0] + data[1] + data[2]);

	}
}
