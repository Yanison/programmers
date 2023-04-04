package level2;

import java.util.*;

/**
 * 배열 오름차순 정렬 Arrays.sort
 */
public class Combination {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {7,8,9};

        System.out.println(solution(arr1,arr2));
    }
    public static int solution(int []A, int []B)
    {
        int min = 0;
        PriorityQueue<Integer> a = new PriorityQueue<>();
        PriorityQueue<Integer> b = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < A.length; i++) {
            a.add(A[i]);
            b.add(B[i]);
        }

        for (int e = 0; e < A.length; e++) {
            min += a.poll() * b.poll();
        }
        return min;
    }
}