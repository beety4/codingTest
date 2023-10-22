// 23.08.12
// https://school.programmers.co.kr/learn/courses/30/lessons/72410

package Programmers;

public class _72410_신규아이디추천 {
	public static void main(String[] args) {
		String new_id = "abcdefghijklmn.p";
		System.out.println(solution(new_id));
	}
	
	public static String solution(String new_id) {        
        // step 1
        new_id = new_id.toLowerCase();
        
        // step 2
        String answer = new_id.replaceAll("[^a-z0-9-_.]", "");
        
        // step 3
        answer = answer.replaceAll("\\.{2,}", ".");
        
        // step 4
        answer = answer.replaceAll("^\\.|\\.$", "");

        // step 5
        if(answer.length() == 0) {
        	answer = "a";
        }
        
        // step 6
        if(answer.length() >= 16) {
        	answer = answer.substring(0, 15);
        	answer = answer.replaceAll("\\.$", "");
        }
        
        // step 7
        if(answer.length() <= 2) {
        	int len = answer.length();
        	for(int i=0; i<= 2-len; i++) {
        		answer += answer.charAt(len-1);
        	}
        }
        
        return answer;
    }
}
