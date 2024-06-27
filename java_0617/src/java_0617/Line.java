package java_0617;
public class Line extends Shape {
	private int x2, y2;
	//기본생성자
	public Line() {
	}
	//모든변수(4개)를 매개변수로 받는 생성자
	//Source메뉴->Generate Constructor Using Fields->Generate
	public Line(int x, int y, int x2, int y2) {
		super(x, y);//x,y는 부모클래스에게 전달,저장
		this.x2 = x2;
		this.y2 = y2;
	}
	//getter, setter
	public int getX2() {
		return x2;
	}
	public void setX2(int x2) {
		this.x2 = x2;
	}
	public int getY2() {
		return y2;
	}
	public void setY2(int y2) {
		this.y2 = y2;
	}
	public void printInfo() {
		super.printInfo();
		System.out.println("x2="+x2+",y2="+y2);
	}
	public void draw() {
		System.out.println("Draw Line");
		printInfo();//해도되고 안해도되고
	}
}











