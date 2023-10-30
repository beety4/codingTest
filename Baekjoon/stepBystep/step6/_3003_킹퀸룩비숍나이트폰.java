package Baekjoon.stepBystep.step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 23.10.30
// https://www.acmicpc.net/problem/3003
public class _3003_킹퀸룩비숍나이트폰 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = {1, 1, 2, 2, 2, 8 };
		for(int i=0; i<6; i++) {
			int input = Integer.parseInt(st.nextToken());
			System.out.print(arr[i] - input + " ");
		}

	}
}
