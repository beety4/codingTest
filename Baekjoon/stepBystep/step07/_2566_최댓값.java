package Baekjoon.stepBystep.step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2566_최댓값 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max = -1;
		String loc = "";
		for(int i=0; i<9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<9; j++) {
				int value = Integer.parseInt(st.nextToken());
				
				if(max < value) {
					max = value;
					loc = (i+1) + " " + (j+1);
				}
			}
		}
		
		System.out.print(max + "\n" + loc);

	}
}
