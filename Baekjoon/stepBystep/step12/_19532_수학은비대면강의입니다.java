package Baekjoon.stepBystep.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24.01.14
// https://www.acmicpc.net/problem/19532
public class _19532_수학은비대면강의입니다 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] o = new int[6];
		for(int i=0; i<6; i++) {
			o[i] = Integer.parseInt(st.nextToken());
		}
		
		//int x = (o[5]*o[1] - o[2]*o[4]) / (o[1]*o[3] - o[0]*o[4]);
		//int y = (o[2] - o[0]*x) / o[1];
		
		for(int i=-999; i<=999; i++) {
			for(int j=-999; j<=999; j++) {
				if(o[0]*i + o[1]*j == o[2] &&
				   o[3]*i + o[4]*j == o[5]) {
					System.out.println(i + " " + j);
				}
			}
		}
	}

}
