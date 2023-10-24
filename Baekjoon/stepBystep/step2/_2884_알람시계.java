package Baekjoon.stepBystep.step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 23.10.24
// https://www.acmicpc.net/problem/2884
public class _2884_알람시계 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		if(m-45 < 0) {
			h -= 1;
			m = 60 - Math.abs(m-45);
		} else {
			m -= 45;
		}
		if(h < 0) {
			h = 24 - Math.abs(h);
		}
	
		System.out.println(h + " " + m);
			
	}

}
