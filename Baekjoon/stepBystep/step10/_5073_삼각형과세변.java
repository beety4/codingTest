package Baekjoon.stepBystep.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 23.12.24
// https://www.acmicpc.net/problem/5073
public class _5073_삼각형과세변 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = null;
		while((input = br.readLine()).equals("0 0 0") == false) {
			StringTokenizer st = new StringTokenizer(input);
			
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
			
			if(data[0] + data[1] + data[2] - data[comp] <= data[comp]) {
				System.out.println("Invalid");
			} else if(data[0] == data[1] && data[1] == data[2]) {
				System.out.println("Equilateral");
			} else if(data[0] == data[1] || data[1] == data[2] || data[2] == data[0]) {
				System.out.println("Isosceles");
			} else {
				System.out.println("Scalene");
			}
				
		}
	}
}
