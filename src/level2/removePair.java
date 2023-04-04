package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class removePair {
    public static void main(String[] args) {
        // 길이를 줄여서 마지막 문자 지우기
        StringBuilder sb = new StringBuilder("hello world");
        sb.setLength(sb.length()-1);
        System.out.println(sb);

        // 특정 인덱스에서 char 지우기
        StringBuilder sb2 = new StringBuilder("hello world");
        sb2.charAt(3);
        sb2.deleteCharAt(3);
        System.out.println(sb2);

        String[] str = sb2.toString().split(" ");
        System.out.println(Arrays.toString(str));
        System.out.println(str[0].charAt(1));

    }
}
