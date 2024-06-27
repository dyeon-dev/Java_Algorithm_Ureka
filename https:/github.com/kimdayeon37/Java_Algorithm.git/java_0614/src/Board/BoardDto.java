package Board;
/**
	 * 웹게시물 클래스. 이름정하기  BoardDto
	멤버변수 -> 뭐가있을지?
	class BoardDto{
	  int no; //게시물번호
	  String title;//게시물 제목
	  String writerId;//작성자id
	  String writeDate;//작성일시
	  String content;//게시물 본문
	}
	캡슐화 적용.(변수에 private 붙이고 getter, setter 작성)
 * 
 * */
public class BoardDto {
	  private int no; //게시물번호
	  private String title;//게시물 제목
	  private String writerId;//작성자id
	  private String writeDate;//작성일시
	  private String content;//게시물 본문
	
	  // 기본 생성자 
	  public BoardDto() {
	  }

	// 모든 변수를매개변수로 받는 생성
	  public BoardDto(int no, String title, String writerId, String writeDate, String content) {
		super();
		this.no = no;
		this.title = title;
		this.writerId = writerId;
		this.writeDate = writeDate;
		this.content = content;
	}

	// Getter. Setter
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriterId() {
		return writerId;
	}

	public void setWriterId(String writerId) {
		this.writerId = writerId;
	}

	public String getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}	  
	  	  
	public void printInfo() {
		System.out.println("no="+no+",title="+title+", writerId"+writerId+", writeDate="+writeDate+", content="+content);
	}
}

