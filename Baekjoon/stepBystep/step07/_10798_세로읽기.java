package Baekjoon.stepBystep.step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10798_세로읽기 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] arr = new int[15][15];
		String value = "";
		int i = 0;
		// 코드 제출 시 "" 아니라 null로 제출
		while((value = br.readLine()) != "") {
			for(int j=0; j<value.length(); j++) {
				arr[i][j] = value.charAt(j);
			}
			i++;
		}
		
		
		for(int k=0; k<15; k++) {
			for(int l=0; l<15; l++) {
				if(arr[l][k] != 0) {
					System.out.print((char)arr[l][k]);
				}
			}
		}
		
	}
}
