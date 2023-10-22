// 23.08.12
// https://school.programmers.co.kr/learn/courses/30/lessons/120922

package Programmers;

public class _120922_종이자르기 {	
	public static void main(String[] args) {
		int M = 1;
		int N = 2;
		System.out.println(solution(M, N));	
	}
	
	public static int solution(int M, int N) {
        int answer = M*N - 1;
        return answer;
    }
}
