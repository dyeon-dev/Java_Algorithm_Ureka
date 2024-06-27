package java_0614;
/** 학생 클래스 */

public class StudentDto extends Person{
	private String hakbun;
	private String jungong;
	
	// 생성자 작성
	public StudentDto() {
		
	}

	// 모든 변수를 매개변수로 받는 생성자 
	public StudentDto(String name, String tel, String hakbun, String jungong) {
		//setName(name); // this로 사용할 수 없고, 간접 접근 해야한다.  
		//setTel(tel);
		super(name, tel);
		this.hakbun = hakbun;
		this.jungong = jungong;
	}

	// getter, setter
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
	//모든 변수를 출력하는 메서드
	public void printInfo() {
		super.printInfo(); // 부모클래스에 존재하는 printInfo 실행 
		System.out.println( "hakbun="+hakbun+", =jungong"+jungong );
	}
	
}
