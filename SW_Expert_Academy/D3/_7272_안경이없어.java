package SW_Expert_Academy.D3;

import java.util.Scanner;
import java.io.FileInputStream;

// 23.07.01
// https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWl0ZQ8qn7UDFAXz&
// [주의사항] JAVA 제출시 클래스 이름은 Solution 이여야 함.
public class _7272_안경이없어 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		// 이전 버퍼에 있는 개행문자 넘기기
		sc.nextLine();
		
		// 테스트 케이스 반복
		for(int test_case = 1; test_case <= T; test_case++) {
			// 비교 문자열을 comp[0]과 comp[1]로 나눔
			String[] comp = sc.nextLine().split(" ");
			
			// 문자 비교 후 저장할 코드 문자열
			String one = "";
			String two = "";
			// 글자 수 만큼 반복해서 한글자씩 판별
			for(int i=0; i<comp[0].length(); i++) {
				// 글자 수가 다르다면 바로 중지 후 DIFF처리
				if(comp[0].length() != comp[1].length()) {
					one = "X";
					break;
				}
				
				// B:2 , 구멍있는 문자:0 , 그외:1 로 one, two 문자열에 저장
				if(comp[0].charAt(i) == 'B') {
					one += "2";
				} else if(comp[0].charAt(i) == 'A' ||
						comp[0].charAt(i) == 'D' ||
						comp[0].charAt(i) == 'O' ||
						comp[0].charAt(i) == 'P' ||
						comp[0].charAt(i) == 'Q' ||
						comp[0].charAt(i) == 'R') {
					one += "0";
				} else {
					one += "1";
				}
				
				if(comp[1].charAt(i) == 'B') {
					two += "2";
				} else if(comp[1].charAt(i) == 'A' ||
						comp[1].charAt(i) == 'D' ||
						comp[1].charAt(i) == 'O' ||
						comp[1].charAt(i) == 'P' ||
						comp[1].charAt(i) == 'Q' ||
						comp[1].charAt(i) == 'R') {
					two += "0";
				} else {
					two += "1";
				}
			}

			// 만든 one과two 비교 후 같으면 SAME 다르면 DIFF 출력
			//System.out.println(one);
			//System.out.println(two);
			if(one.equals(two)) {
				System.out.println("#" + test_case + " SAME");
			} else {
				System.out.println("#" + test_case + " DIFF");
			}
		}
		sc.close();
	}

}
