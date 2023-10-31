package Baekjoon.stepBystep.step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// 23.10.24 
// https://www.acmicpc.net/problem/15552
public class _15552_빠른A더하기B {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			StringBuilder sb = new StringBuilder();
			sb.append(a + b);
			sb.append("\n");
			bw.write(sb.toString());
			
		}
		bw.flush();
		bw.close();
	}
}
