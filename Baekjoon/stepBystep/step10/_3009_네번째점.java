package Baekjoon.stepBystep.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 23.12.23
// https://www.acmicpc.net/problem/3009
public class _3009_네번째점 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] x = new int[3];
		int[] y = new int[3];
		for(int i=0; i<3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
		
		int a = 0, b = 0;
		if(x[0] == x[1]) {
			a = x[2];
		} else if(x[1] == x[2]){
			a = x[0];
		} else {
			a = x[1];
		}
		
		if(y[0] == y[1]) {
			b = y[2];
		} else if(y[1] == y[2]){
			b = y[0];
		} else {
			b = y[1];
		}
		
		System.out.println(a + " " + b);
	}
}
