package SW_Expert_Academy.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24.01.03
// https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&contestProbId=AV5PTeo6AHUDFAUq
public class _1926_간단한369게임 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int t=0; t<T; t++) {
			int n = Integer.parseInt(br.readLine());
			for(int i=1; i<=n; i++) {
				String num = Integer.toString(i);
				int len = num.length() - num.replaceAll("[369]", "").length();
				
				if(len > 0) {
					for(int j=0; j<len; j++) {
						System.out.print("-");
					}
					System.out.print(" ");
				} else {
					System.out.print(num + " ");
				}
			}
		}
	}
}
