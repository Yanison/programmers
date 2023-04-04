package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Binary {
    public static void main(String[] args) {
        String s = "11001010100111010111111";
        int[] r = solution(s);
        System.out.println("arr "+Arrays.toString(r));
    }

    /**
     * 리스트를 인트로 바꾸는 방법
     * List<Integer> list = new ArrayList<Integer>() -> int[]
     * list.stream().mapToInt(i -> i).toArray();
     * * 1. 0,1 로 이루어진 문자열 s
     *          * s가 1이 될 때 까지 계속해서 s를 이진 변환
     *          *
     *          * 이진변환의 정의
     *          * s에서 "1"만 추출 후 그 길이값을 이진수로 나타냄
     */
    public static int[] solution(String s) {
        System.out.println("s :: "+s);
        String str = s;
        int count =0;
        int times = 0;
        List<Integer> list = new ArrayList<Integer>();
        while(true){
            System.out.println("str :: "+ str);
            if(str.length() == 1){
                break;
            }else {
                String empty = "";
                for (int i = 0; i < str.length(); i++) {
                    if(str.charAt(i) == '1'){
                        empty += String.valueOf(str.charAt(i));
                    }else{
                        count += 1;
                    }
                }
                str = empty;
                str = Integer.toBinaryString(str.length());
                times += 1;
            }
        }

        int[] resutl = {count,times};
        return resutl;
    }
}
