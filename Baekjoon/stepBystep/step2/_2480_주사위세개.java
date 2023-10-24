package Baekjoon.stepBystep.step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 23.10.24
// https://www.acmicpc.net/problem/2480
public class _2480_주사위세개 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int answer = 0;
		
		
		if(a==b && b==c) {
			answer = 10000 + a*1000;
		} else if(a==b) {
			answer = 1000 + a*100;
		} else if(b==c) {
			answer = 1000 + b*100;
		} else if(c==a) {
			answer = 1000 + c*100;
		} else {
			int high = a;
			if(high < b) {
				high = b;
			}
			if(high < c){
				high = c;
			}
			answer = high*100;
		}
		
		System.out.println(answer);
	}

}
