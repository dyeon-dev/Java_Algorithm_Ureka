package java_0614;
/** 공통 변수 정의용 */
public class Person {
	/** 이름 */
	String name;
	/** 전화 */
	String tel;
	//생성자 작성
	//기본생성자 작성( Ctrl+space  엔터)
	public Person() {
	}
	public Person(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	//변수의 현재값을 전체 출력하는 메서드
	public void printInfo() {
		System.out.println("name="+name+", tel="+tel);
	}
}