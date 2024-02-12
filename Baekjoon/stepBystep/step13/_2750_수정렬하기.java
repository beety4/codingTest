package Baekjoon.stepBystep.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// 24.02.11
// https://www.acmicpc.net/problem/2750
public class _2750_수정렬하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int m = Integer.parseInt(br.readLine());
			
			boolean TF = true;
			for(int j=0; j<arr.size(); j++) {
				if(m < arr.get(j)) {
					arr.add(j, m);
					TF = false;
					break;
				}
			}
			
			if(TF) {
				arr.add(m);
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(arr.get(i));
		}
	}

}
