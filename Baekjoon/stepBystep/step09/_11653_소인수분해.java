package Baekjoon.stepBystep.step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 23.12.20
// https://www.acmicpc.net/problem/11653
public class _11653_소인수분해 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int i = 2;
		while(true) {
			if(n%i == 0) {
				n = n/i;
				System.out.println(i);
				i = 2;
				
				boolean check = true;
				for(int j=2; j<n; j++) {
					if(n%j == 0) {
						check = false;
						break;
					}
				}
				
				System.out.println("==> " + i );
				if(check && n != 1) {
					return;
				}
			} else {
				i++;
			}
			System.out.println("efefefefefefefefef");
		}
		
		
	}
}
