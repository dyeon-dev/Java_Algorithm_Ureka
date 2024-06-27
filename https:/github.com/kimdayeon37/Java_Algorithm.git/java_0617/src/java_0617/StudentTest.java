package java_0617;

public class StudentTest {

	public static void main(String[] args) {

		Student s = new Student("홍", "010-111", "100", "컴공");
		s.printInfo();
		
		Emp e = new Emp("김", "010-222", "1100", "개발 1팀");
		e.printInfo();
		
		// 다형성 
		Person p = s; // "객체의 형변환" 부모타입변수 <= 자식타입객체 업캐스팅 
		
		p.getName();
		
		// 객체 형변환은 아래같은 코드를 목표로 한다
		// 다양한 자식 객체들을 부모타입 1가지로 일괄 관리 가능하다.
		Person[] parr = new Person[3];
		parr[0] = new Student("강", "010-211", "102", "소공");
		parr[1] = new Emp("박", "010-312", "1101", "영업1팀");
		parr[2] = new Student("황", "010-212", "112", "산공");
		
	   // 동일 변수에 여러가지 타입 저장가능한 기능 (다형성)
//		Student s1 = (Student)parr[0]; // 강제형변환 
//		Emp e1 = (Emp)parr[1];
// 		Student s1 = (Student)parr[1]; => error
		

		// 개념이 중요~
		System.out.println(parr[0] instanceof Student); // true
		System.out.println(parr[1] instanceof Student); // false
		System.out.println(parr[2] instanceof Student); // true  
		

		if(parr[0] instanceof Student) {
			Student s1 = (Student)parr[0];
			System.out.println("학번="+s1.getHakbun());
		} else {
			System.out.println("0번은 학생 아님");
		}
		
		if(parr[1] instanceof Student) {
			Student s1 = (Student)parr[1];
			System.out.println("학번="+s1.getHakbun());
		} else {
			System.out.println("1번은 학생 아님");
		}
		
		Person p1 = new Student("강", "010-211", "102", "소공");
		p1.printInfo(); // Student.printInfo() 호출 
		Person p2 = new Emp("박", "010-312", "1101", "영업1팀");
		p2.printInfo(); // Emp.printInfo()호출 
	}

}
