package Baekjoon.stepBystep.step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

// 23.10.26
// https://www.acmicpc.net/problem/3052
public class _3052_나머지 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashSet<Integer> set = new HashSet<>();
		for(int i=0; i<10; i++) {
			int a = Integer.parseInt(br.readLine());
			set.add(a%42);
		}

		System.out.println(set.size());
	}
}
