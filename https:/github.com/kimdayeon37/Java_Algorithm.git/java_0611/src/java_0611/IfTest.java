package java_0611;

public class IfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = new int[2][3];
		int total =0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				total+=arr[i][j];
			}
		}
		System.out.println("총합"+total);
	}

}
