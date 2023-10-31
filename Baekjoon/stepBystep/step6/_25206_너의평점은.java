package Baekjoon.stepBystep.step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 23.10.31
// https://www.acmicpc.net/problem/25206
public class _25206_너의평점은 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = "";
		double sum = 0;
		double allScore = 0;
		// 코드 제춠 시 "" 이아닌 null 로 제출
		while((line = br.readLine()) != "") {
			double score = Double.parseDouble(line.split(" ")[1]);
			String grade = line.split(" ")[2];
			allScore += score;
			
			switch(grade) {
				case "A+": sum += score * 4.5; break;
				case "A0": sum += score * 4.0; break;
				case "B+": sum += score * 3.5; break;
				case "B0": sum += score * 3.0; break;
				case "C+": sum += score * 2.5; break;
				case "C0": sum += score * 2.0; break;
				case "D+": sum += score * 1.5; break;
				case "D0": sum += score * 1.0; break;
				case "P" : allScore -= score; break;
			}
		}
		
		double result = sum / allScore;
		System.out.println(result);

	}
}
