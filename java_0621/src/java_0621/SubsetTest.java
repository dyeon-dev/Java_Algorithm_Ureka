package java_0621;
public class SubsetTest {
	static int N = 3;
	static char[] element = new char[]{'A','B','C'};
	static boolean[] isSelected=new boolean[3];
	
	static int totalcnt = 0; // 부분집합의 개수
	
	public static void main(String[] args) {		
		subset(0);
		System.out.println("부분집합의 총 개수 : " + totalcnt);
	}
	public static void subset(int cnt) {		
		if(cnt == N) {
			totalcnt++;
			System.out.print("{");
			for (int i = 0; i < N; i++) {				
				if(isSelected[i] == true)
					System.out.print(element[i] + " ");
			}
			System.out.println("}");
			return;
		}		
		isSelected[cnt] = true;
		subset(cnt+1);
		isSelected[cnt] = false;
		subset(cnt+1);
	}
}