package level2;

import java.util.Arrays;

public class correctBraket {


    public static void main(String[] args) {


        System.out.println(solution("()()()()"));
        System.out.println(solution("(())()"));
        System.out.println(solution(")()("));
        System.out.println(solution("(()("));
        System.out.println(solution("())(()"));
    }

    /**
     * 1. '('과 ')'의 갯수가 똑같아야함
     * 2. ')'이나 '('로 끝나는 문자열이면 안됨
     * 3.
     */
    static boolean solution(String s) {
        boolean answer = true;

        int left = 0,right = 0;
        int ln = s.length();
        for (int i = 0; i < ln; i++) {

            if(s.charAt(0) == ')' || s.charAt(ln-1) == '('){
                answer = false;
            }else if(s.charAt(i) == '(' && s.charAt(i+1) == ')'){
                answer = true;
            }else{

            }

            if(s.charAt(i) == '('){
                left += 1;
            }else if(s.charAt(i)  == ')') {
                right += 1;
            }
        }


        return answer;
    }

}
