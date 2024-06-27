package java_0610;

import java.util.Scanner;

public class Hello {
/**
 * 2024.06.10
 */
	public static void main(String[] args) {
		System.out.println("태어난 년도 4자리 >> ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int age = 2024-Integer.parseInt(s);
		String ans = (age<19)?"미성년자":"성인";
		System.out.println(age);
		System.out.println(ans);
	}
	

}