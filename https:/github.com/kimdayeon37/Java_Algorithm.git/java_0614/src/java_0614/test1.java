package java_0614;
public class test1 {
	public static void main(String[] args) {
		Person p = new Person("홍","010-11"); // 간접접근 
//		p.name = "홍";
//		p.tel = "010-111";
		p.printInfo();
		System.out.println(p.getName());
		System.out.println(p.getTel());

		p.setName("김");
		p.setTel("12344");

		p.printInfo();
	}
	
}