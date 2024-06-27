package java_0614_Book;

public class BookDto {

	/**	
	 * 데이터용 클래스 작성 요령
		1. 이름에 Dto붙이기( StudentDto, XXX Dto )
		2. 변수에 private 적용
		   private String name;
		2-1. 생성자 메서드 작성
		   기본생성자 메서드
		   모든 변수를 매개변수로 받는 생성자 메서드
		3. private변수용 getter, setter 메서드 작성
		   public String getName(){ return name; }
		   public void setname(String name){this.name = name;}
		4. 내부변수값 출력용 메서드 작성
		   public void printInfo(){ ... } 
	 * */
	
	
	// 멤버변수 
	private String title;
	private String isbn;
	private int price;
	
	//기본 생성자 (ctrl+space)
	public BookDto() {
	}
	
	// 모든 변수를 매개변수로 받는 생성자 메서드
	public BookDto(String title, String isbn, int price) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.price = price;
	}
	
	//getter, setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	// printInfo 
	public void printInfo() {
		System.out.println("title="+title+ ",isbn="+isbn+ ",price="+price);
	}
}
