package Baekjoon.stepBystep.step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 23.10.31
// https://www.acmicpc.net/problem/2941
public class _2941_크로아티아알파벳 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int a = (input.length() - input.replaceAll("dz=", "").length())/3;
		int b = (input.length() - input.replaceAll("c=|c-|d-|lj|nj|s=", "").length())/2;
		int c = input.replaceAll("c=|c-|d-|lj|nj|s=|z=|dz=", "").length();
		
		String reInput = input.replaceAll("dz=", " ");
		int d = (reInput.length() - reInput.replaceAll("z=", "").length())/2;

		System.out.println(a+b+c+d);
		
	}
}
