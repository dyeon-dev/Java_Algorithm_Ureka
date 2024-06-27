package java_0617;

public class Student extends Person {

	private String hakbun;
	private String jungong;
	public Student() {

	}
	public Student(String name, String tel, String hakbun, String jungong) {
		super(name, tel);
		this.hakbun = hakbun;
		this.jungong = jungong;
	}
	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public String getJungong() {
		return jungong;
	}
	public void setJungong(String jungong) {
		this.jungong = jungong;
	}
	
	//내부변수를 출력하는 printInfo()
		public void printInfo() {
			super.printInfo();//부모클래스의 printInfo() 호출
			System.out.println("hakbun="+hakbun+",jungong="+jungong);
		}
		
}
