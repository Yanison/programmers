package test;

import java.util.ArrayList;
import java.util.List;

public class EatCake {
    public static void main(String[] args) {
        /**
         * 1번 조각 기준으로 시계방향으로 n번 조각 까지 순서대로 있다.
         * 케이크 먹는 규칙
         * 1. 항상 1번먼저 먹는다.
         * 2. 다음 조각은 남아있는 조각들 중 k번째
         * 3. 케이크가 2조각 남으면 먹는것을 멈춘다.
         *
         * -입력
         * 케이크 조각 갯수 n
         * 주어진 숫자 k
         *
         * -출력
         * 남은 케이크 2조각의 번호를 공백을 두고 정수형태로 출력
         */
        String input = "6 3";
        int n = Integer.parseInt(input.split(" ")[0]);
        int k = Integer.parseInt(input.split(" ")[1]);
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < n+1; i++) {
            list.add(i);
        }
        System.out.println("first :: "+list);
        while (list.size()> 2){
            for (int e = 0; e < list.size(); e+=k-1) {
                list.remove(e);
            }

        }
        System.out.println(list.get(0) + " "+list.get(1));
    }
}
