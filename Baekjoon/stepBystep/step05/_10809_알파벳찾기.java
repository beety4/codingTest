package Baekjoon.stepBystep.step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 23.10.28
// https://www.acmicpc.net/problem/10809
public class _10809_알파벳찾기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		for(int i=0; i<26; i++) {
			char alphabet = (char)(97 + i);
			System.out.print(s.indexOf(alphabet) + " ");
		}

	}
}
