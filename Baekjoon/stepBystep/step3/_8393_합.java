package Baekjoon.stepBystep.step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _8393_합 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int max = n;
		
		for(int i=1; i<max; i++) {
			n += i;
		}
		
		System.out.println(n);

	}

}
