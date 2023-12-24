package Baekjoon.stepBystep.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 23.12.24
// https://www.acmicpc.net/problem/9063
public class _9063_대지 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
			
		int minX = 10000, minY = 10000;
		int maxX = -10000, maxY = -10000;
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			minX = (a<minX) ? a : minX;
			minY = (b<minY) ? b : minY;
			maxX = (a>maxX) ? a : maxX;
			maxY = (b>maxY) ? b : maxY;
		}
		
		int result = (maxX - minX) * (maxY - minY);
		System.out.println((result <= 0) ? 0 : result);
	}

}
