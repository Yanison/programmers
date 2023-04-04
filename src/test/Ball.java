package test;

import java.util.*;

public class Ball {
    static int lostA = 0;

    public static void main(String[] args) {
        /**
         * Java 구슬게임
         * 1. A,B 2명이서 짝을 지어 게임을 한다 A,B에게 주어진 구슬은 각각 n,m이다.
         * 2. 게임 종료 조건
         *  - 2명 중 한 명이 모든 구슬을 잃은 경우
         *  - 또는 최대 k번 진행된 후 종료
         * 3. 가위바위보로 서로 구슬을 주고 받음
         *  - 승리 + 1 구슬
         *  - 패배 - 1 구슬
         *  - 무승부 + 0 구슬
         *
         *  n과,m은 1이상 100이하이고 k는 1이상 1000이하이다.
         *  둘 중 한명이 모든 구슬을 잃을 수 있는 경우의 수를 구하라
         *
         *  게임 1회에 나오는 게임결과의 경우의 수는 승리 패배 무승부 총 3가지,
         *  그러므로 게임이 k번 동안 진행이 된다면 게임 결과의 모든 경우의 수는 k^3
         *  연속된 k번의 게임에서 나오는 모든 경우의 수를 구하라.
         *
         *  그런 다음 두명의 플레이어중 한명의 구슬이 동나는 경우를 구해야 한다.
         *  n개,m개의 구슬이 주어진 경우 각각 0이되는 경우는..
         */
        String input = "2 2 3";
        String input2 = "2 3 4";
        int goormscore = Integer.parseInt(input2.split(" ")[0]);
        int otherscore = Integer.parseInt(input2.split(" ")[1]);
        int times = Integer.parseInt(input2.split(" ")[2]);
        int[] result = {1, -1, 0};
        /**
         * 주어진 게임 횟수 만큼
         * 각 횟수당 결과를 나타내는 테이블을 만들어라.
         */
        gameResults(result, new int[times], 0, times,goormscore);
        //gameResults2(result, new int[times], 0, 0, times,goormscore);
    }

    public static void gameResults(int[] arr, int[] out, int depth, int r,int beads) {
        if(depth == r){
            int[] in = new int[out.length];
            for (int e = 0; e < out.length; e++) {
                beads += out[e];
            }
            if(beads <= 0){
                System.out.println("left :: " + beads);
                lostA += 1;
            }
            System.out.println(lostA);
            return;
        }

        for(int i=0; i<arr.length; i++){
            out[depth] = arr[i];
            gameResults(arr, out, depth+1, r,beads);
        }
    }

    public static void gameResults2(int[] arr, int[] out, int start, int depth, int r,int beads) {
        if(depth == r){
            int[] in = new int[out.length];
            for (int e = 0; e < out.length; e++) {
                in[e]=out[e];
            }
            System.out.println(Arrays.toString(in));
            for (int j = 0; j < in.length; j++) {
                beads += in[j];
            }
            if(beads <= 0){
                System.out.println("left :: " + beads);
                lostA += 1;
            }
            System.out.println(lostA);
            return;
        }

        for(int i=start; i<arr.length; i++){
            out[depth] = arr[i];
            gameResults2(arr, out, i, depth+1, r,beads);
        }
    }
}
