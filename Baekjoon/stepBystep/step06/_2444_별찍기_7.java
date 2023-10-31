package Baekjoon.stepBystep.step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 23.10.30
// https://www.acmicpc.net/problem/2444
public class _2444_별찍기_7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int lineC = n*2 - 1;
		int spaceU = n;
		int spaceD = 0;
		int starD = lineC;
		for(int i=0; i<lineC; i++) {
			if(i < n) {
				spaceU -= 1;
				int starU = i*2 + 1;
				for(int j=spaceU; j>0; j--) {
					System.out.print(" ");
				}
				for(int k=0; k<starU; k++) {
					System.out.print("*");
				}
			} else {
				spaceD += 1;
				starD -= 2;
				for(int j=0; j<spaceD; j++) {
					System.out.print(" ");
				}
				for(int k=starD; k>0; k--) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}
}
