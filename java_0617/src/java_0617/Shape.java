package java_0617;

/** 도형의 공통 정보 */

abstract public class Shape {
	private int x,y; // 시작좌표 
	public Shape() {
		
	}
	
	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void printInfo() {
		System.out.println("x=x"+x+",y="+y);
	}
	
	
	// 도형 그리기 
	// 1. 메서드에 abstract 선언, 블록 {} 대신 ; 작성
	// 2. 클래스 선언부에 abstract 붙이기 
	// 3. 추상 메서드는 자식 클래스에서 반드시 오버라이딩 해야한다.
	abstract public void draw();
				
	
}
