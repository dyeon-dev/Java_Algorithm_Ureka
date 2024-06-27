package java_0613_dto;

public class StudentDto {
	
	public StudentDto(String hakbun, String name, String tel) {
		this.hakbun =hakbun;
		this.name = name;
		this.tel = tel;
	}
	String hakbun;
	String name;
	String tel;
	
	public void printInfo() {
		System.out.println("hackbun="+hakbun);
		System.out.println("name="+name);		
		System.out.println("tel="+tel);
		
	}
}
