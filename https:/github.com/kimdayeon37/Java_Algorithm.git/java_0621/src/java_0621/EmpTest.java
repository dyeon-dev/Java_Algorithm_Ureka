package java_0621;

import java.util.Arrays;
public class EmpTest {
	public static void main(String[] args) {
		Emp[] earr = new Emp[3];
		earr[0] = new Emp(200, "홍");
		earr[1] = new Emp(100, "김");
		earr[2] = new Emp(101, "박");
		Arrays.sort(earr);
		System.out.println(Arrays.toString(earr));
	}
}