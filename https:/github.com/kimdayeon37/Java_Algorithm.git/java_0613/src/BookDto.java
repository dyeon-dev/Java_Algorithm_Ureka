public class BookDto {
	public static String pub = "빝미디어";

	public BookDto(String title, String isbn, int price) {
		this.title =title;
		this.isbn = isbn;
		this.price = price;
	}
	String title;
	String isbn;
	int price;
	
	public void printInfo() {
		System.out.println("title="+title+ ",isbn="+isbn+ ",price="+price);
	}
}
