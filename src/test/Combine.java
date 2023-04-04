package test;

import java.util.Arrays;

public class Combine {
    /**
     * @param arr 서로 다른 수의 배열
     * @param out 뽑아낼 조합의 배열 (=r)
     * @param depth
     * @param r
     */
    public static void permutation(int[] arr, int[] out, int depth, int r){
        if(depth == r){
            int[] in = new int[out.length];
            for (int e = 0; e < out.length; e++) {
                in[e] = out[e];
            }
            System.out.println(Arrays.toString(in));

            return;
        }

        for(int i=0; i<arr.length; i++){
            out[depth] = arr[i];
            permutation(arr, out, depth+1, r);
        }
    }

    public static void combination(int[] arr, int[] out, int start, int depth, int r){
        if(depth == r){
            int[] in = new int[out.length];
            for (int e = 0; e < out.length; e++) {
                in[e] = out[e];
            }
            System.out.println(Arrays.toString(in));
            return;
        }
        for(int i=start; i<arr.length; i++){
            out[depth] = arr[i];
            combination(arr, out, i, depth+1, r);
        }
    }


    public static void main(String[] args){
        // 서로다른 수의 배열
        int[] arr = {-1, 0, 1};
        //배열에서 뽑을 수
        int r = 3;
        permutation(arr, new int[r], 0, r);
        //combination(arr, new int[r], 0, 0, r);
    }


}
