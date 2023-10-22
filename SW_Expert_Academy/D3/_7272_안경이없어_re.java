package SW_Expert_Academy.D3;

import java.util.Scanner;
import java.io.FileInputStream;

// 23.07.01
// https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWl0ZQ8qn7UDFAXz&
// [주의사항] JAVA 제출시 클래스 이름은 Solution 이여야 함.
public class _7272_안경이없어_re {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        // 이전 버퍼에 있는 개행문자 넘기기
        sc.nextLine();
         
        // 테스트 케이스 반복
        for(int test_case = 1; test_case <= T; test_case++) {
            // 비교 문자열을 comp[0]과 comp[1]로 나눔
            String[] comp = sc.nextLine().split(" ");
             
            // 글자수가 다르면 DWIFT 출력후 이번 케이스는 패스
            if(comp[0].length() != comp[1].length()) {
                System.out.println("#" + test_case + " DIFF");
                continue;
            }
             
            // 검사 후 문제 없으면 SAME 출력을 위해 true 로 선언
            boolean check = true;
             
            // 글자 수 만큼 반복해서 한글자씩 판별
            for(int i=0; i<comp[0].length(); i++) {
                boolean is1 = false, is2 = false;
                 
                // 두개 다 B이면 다음 글자로 넘김
                // 두개 다 가 아니라 하나만 B라면 false 주고 중지
                if(comp[0].charAt(i) == 'B' && comp[1].charAt(i) == 'B') {
                    continue;
                } else if(comp[0].charAt(i) == 'B' || comp[1].charAt(i) == 'B') {
                    check = false;
                    break;
                }
                 
                // 구멍이 뚤린 문자인지 아닌지 검사
                for(char ch : new char[] { 'A', 'D', 'O', 'P', 'Q', 'R' }) {
                    if(ch == comp[0].charAt(i)) {
                        is1 = true;
                    }
                    if(ch == comp[1].charAt(i)) {
                        is2 = true;
                    }
                }
                 
                // 구멍이 있는 문자면 true 아니면 false
                // 두개가 같은 결과가 아니라면 다른 문자임으로 비교 바로 종료
                if(is1 != is2) {
                    check = false;
                    break;
                }
            }
             
            // 같은 문자인지 아닌지 check를 이용해 출력
            System.out.println("#" + test_case + (check ? " SAME" : " DIFF"));
        }
        sc.close();
    }
 
}
