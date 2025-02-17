package java_0621;
import java.util.Arrays;
public class CombinationTest {
    private static int n, r;
    private static int[] arr; // 원소를 저장할 배열
    public static void main(String[] args) {
        n = 4;
        r = 3;
        arr = new int[r];
        combination(0,0);
    }
	// 조합 - 순서 중요X 
    private static void combination(int cnt, int start) {
        if (cnt == r) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        for (int i = start; i <= n; i++) {
            //System.out.print("c: "+cnt+" ");
           // System.out.print("s: "+start+" ");
            arr[cnt] = i;
          //  System.out.print("cnt: "+cnt+" i:"+i+" ");
            combination(cnt + 1, i + 1); // 오름차순으로 구하면 중복 체크하지 않아도 됨
        }
    }
}