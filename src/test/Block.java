package test;

import java.util.*;

public class Block {
    /**
     * 퍼즐판 크기는 가로가 N , 세로가 M
     * 주어진 조각은 4종류 이다.
     * {1,1},{2,2},{4,2},{4,4}
     * 이 조각들은 모두 모양과 색이 같고 회전할 수 없다.
     *
     * 이 조각들을 무한히 사용하여 퍼즐판에 빈 곳이 없게 하고자 한다.
     * 한 번 조각이 맞추어진 곳에 다른 조각을 넣을 수 없으며, 퍼즐 밖으로 조각이 나가서는 안된다.
     * 구름이가 4종류의 펴즐로 퍼즐판을 맞출 수 있는 경우의 수를 구하라.
     *
     */
    public static void main(String[] args) {
        int[][] puzzles = {{1,1},{2,2},{2,4},{4,4}};
        List<Integer[]> grid = makeGrid(2,4);
        int oo = 0;
        int tt = 0;
        int tf = 0;
        int ff = 0;

        // 퍼즐 4개만
        int left = 0;
        for (int i = grid.size()-1; i > 0; i--) {
            int area = grid.get(i)[0] * grid.get(i)[1];
            System.out.println(area);
            if(area % 16 != 0){ left = area % 16;}
            else { ff = area / 16;}

            if(grid.get(i)[0] < 2 || grid.get(i)[1] < 4){
                if(left % 8 != 0){ left = left % 8;}
                else { tf = left / 8;}
            }

            if(left % 4 != 0){ oo = left / 1;}
            else { tt = left / 4;}
        }
        System.out.println("oo :: " + oo + " "+"tt :: " + tt + " "+"tf :: " + tf + " "+"ff :: " + ff);
        int result = oo + tt + tf + ff;
        System.out.println(result);
    }

    /**
     * @param n 가로
     * @param m 세로
     * @return grid[][]
     */
    public static List<Integer[]> makeGrid(int n,int m){
        List<Integer[]> list = new ArrayList<Integer[]>();
        //i :: 가로깊이
        for (int i = 0; i < m+1; i++) {
            for (int j = 0; j < n+1; j++) {
                list.add(new Integer[]{i, j});
            }
        }
        return list;
    }
}
