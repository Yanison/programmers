package test;

import java.util.*;

public class Water {

    static boolean[] visited;
    static boolean[] opened;
    public static void main(String[] args) {
        /**
         * 구름산에 물탱크를 설치하려 한다.
         * 구름 산에는 총 n개의 가구와 n-1개의 단방향 수로가 설치되어 있다.
         * 편의를 위해서는 가구는 1번 가구부터 n번 가구로 한다.
         * 모든 수로는 한쪽 방향으로만 이동한다.
         * 1개의 가구에서 물이 나가는 수로는 여러개 설치될 수 있지만,물이 들어오는 수로는 1개만 설치할 수 있다.
         * 같은 가구에서 물이 나가서, 같은 가구로 물이 들어오는 수로는 없으며, 수로가 순환하는 경우도 없다.
         * 항상 물탱크가 설치 될 수 있는 가구의 위치는 1곳이다.
         *
         * 위의 조건에서 구름이는 물탱크가 설치되어야 하는 가구의 번호를 찾아서 물탱크를 설치하길 원한다.
         * 가구의 개수와 수로의 경로가 주어졌을때, 구름이가 물탱크를 설치해야 하는 위치를 출력하라
         *
         * 입력
         * 첫째 줄 가구의 개수 정수n(1<n<200,000)이 주어진다.
         * 두번째 줄 부터 n-1줄에 걸쳐서 s,e가 공백을 두고 주어진다. s는 물이 나오는 수로가 출밯하는 가구의 번호,
         * e는 물이 들어가는 가구의 번호이다. s,e는 1이상 n이하의 정수이다.
         */
        String[] way = {"6","1 2","1 3","1 4","4 5","4 6"};
        String[] way2 = {"6","1 2","2 3","3 4","4 5","5 6"};
        List<String> lines = new ArrayList<String>(List.of(way));
        List<Node> tree = new ArrayList<Node>();
        visited = new boolean[Integer.parseInt(lines.get(0))];
        opened = new boolean[Integer.parseInt(lines.get(0))];
        for (int i = 1; i < lines.size(); i++) {
            int a = Integer.parseInt(lines.get(i).split(" ")[0]);
            int b = Integer.parseInt(lines.get(i).split(" ")[1]);
            if(!visited[a]){
                visited[a] = true;
                Node n = new Node();
                n.setData(a);
                n.child.add(b);
                tree.add(n);
            }else{
                opened[a] = true;
                for (int e = 0; e < tree.size(); e++) {
                    if(tree.get(e).data == a){
                        tree.get(e).child.add(b);
                    }
                }
            }
        }
        System.out.println("size "+tree.size());
        for (int j = 0; j < tree.size(); j++) {
            System.out.println("node "+ j +" :: data_"+ tree.get(j).data + " child_" + tree.get(j).child);
        }
    }
}

class Node{
    List<Integer> child = new ArrayList<Integer>();
    int data;

    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
}