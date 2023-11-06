package Baekjoon.stepBystep.step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

// 23.11.05
// https://www.acmicpc.net/problem/2720
public class _2720_세탁소사장동혁 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		BigDecimal quarter = new BigDecimal("0.25");
		BigDecimal dime = new BigDecimal("0.1");
		BigDecimal nickel = new BigDecimal("0.05");
		BigDecimal penny = new BigDecimal("0.01");
		
		for(int i=0; i<t; i++) {
			double input = Double.parseDouble(br.readLine()) / 100;
			BigDecimal value = new BigDecimal(Double.toString(input));
			
			BigDecimal a = value.divide(quarter); value = value.remainder(quarter);
			BigDecimal b = value.divide(dime); value = value.remainder(dime);
			BigDecimal c = value.divide(nickel); value = value.remainder(nickel);
			BigDecimal d = value.divide(penny); value = value.remainder(penny);
			
			System.out.print(a.setScale(0, BigDecimal.ROUND_DOWN) + " ");
			System.out.print(b.setScale(0, BigDecimal.ROUND_DOWN) + " ");
			System.out.print(c.setScale(0, BigDecimal.ROUND_DOWN) + " ");
			System.out.print(d.setScale(0, BigDecimal.ROUND_DOWN) + "\n");	
		}
		
	}
}
