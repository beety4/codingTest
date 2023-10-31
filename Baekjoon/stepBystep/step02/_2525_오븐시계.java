package Baekjoon.stepBystep.step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 23.10.24
// https://www.acmicpc.net/problem/2525
public class _2525_오븐시계 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(br.readLine());
		
		if(m + c > 60) {
			h += 1;
			m = m + c - 60;
		} else {
			m += c;
		}
		
		if(m >= 60) {
			h += m / 60;
			m = m % 60;
		}
		if(h >= 24) {
			h = h - 24;
		}
		
		System.out.println(h + " " +  m);

	}

}
