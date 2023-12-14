package Baekjoon.stepBystep.step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// 23.12.14
// https://www.acmicpc.net/problem/9506
public class _9506_약수들의합 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = null;
		while((line = br.readLine()).equals("-1") == false) {
			ArrayList<Integer> arr = new ArrayList<>();
			int n = Integer.parseInt(line);
			int max = 0;
			
			for(int i=1; i<=n; i++) {
				if(n%i == 0 && n != i) {
					arr.add(i);
					max += i;
				}
			}

			StringBuilder sb = new StringBuilder();
			if(max == n) {
				sb.append(n + " = ");
				for(int i=0; i<arr.size(); i++) {
					sb.append(arr.get(i) + " + ");
				}
				System.out.println(sb.toString().substring(0, sb.lastIndexOf("+")));
			} else {
				System.out.println(n + " is NOT perfect.");
			}
			
		}

	}

}
