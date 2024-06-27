package java_0617;
public class Person {
	private String name;
	private String tel;
	//기본생성자
	public Person() {
	}
	//모든 변수를 매개변수로 받는 생성자
	// Source메뉴->Generate Constructor Using Fields->Generate
	public Person(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}
	// getter, setter 메서드 선언
	// Source메뉴->Generate Getter and Setters->Select All->Generate
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	//내부변수를 출력하는 printInfo
	public void printInfo() {
		System.out.println("name="+name+",tel="+tel);
	}
}