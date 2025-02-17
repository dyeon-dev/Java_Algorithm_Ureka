
package java_0621;

import java.util.Arrays;

public class Permutation2 {
    private static int n, r;
    private static int[] arr; // 원소를 저장할 배열
    private static boolean[] visited; // 중복을 제거하기 위한 방문 처리
    public static void main(String[] args) {
        n = 3; // 전체 개수 
        r = 2; // 선택 개수 
        arr = new int[r]; // 선택한 숫자 저장소 
        visited = new boolean[n + 1]; // 숫자 선택 여부 저장 
        permutation(0);
    }//end main()
	// 순열
    private static void permutation(int cnt) {
        if (cnt == r) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        for (int i = 1; i <= n; i++) {
                arr[cnt] = i;
                permutation(cnt + 1);
        }//end for
    }//end permutation()
}