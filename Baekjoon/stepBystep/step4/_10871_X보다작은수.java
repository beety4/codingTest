package Baekjoon.stepBystep.step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 23.10.25
// https://www.acmicpc.net/problem/10871
public class _10871_X보다작은수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int comp = Integer.parseInt(st.nextToken());
		
		int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < comp) {
				System.out.print(arr[i] + " ");
			}
		}

	}
}
