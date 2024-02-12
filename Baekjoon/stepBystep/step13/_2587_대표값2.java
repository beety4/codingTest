package Baekjoon.stepBystep.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

// 24.02.12
// https://www.acmicpc.net/problem/2587
public class _2587_대표값2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=0; i<5; i++) {
			int val = Integer.parseInt(br.readLine());
			arr.add(val);
			sum += val;
		}
		
		Collections.sort(arr);
		
		System.out.println(sum / 5);
		System.out.println(arr.get(2));
	}

}
