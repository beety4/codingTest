package Baekjoon.stepBystep.step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 23.10.25
// https://www.acmicpc.net/problem/10818
public class _10818_최소최대 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int first = Integer.parseInt(st.nextToken());
		int min = first;
		int max = first;
		for(int i=0; i<n-1; i++) {
			int value = Integer.parseInt(st.nextToken());
			
			if(max < value) {
				max = value;
			}
			if(min > value){
				min = value;
			}
		}
		
		System.out.println(min + " " + max);

	}
}
