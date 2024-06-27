package java_0617;

public class Emp extends Person {
	private String sabun;
	private String buseo;
	
	public Emp() {
		// TODO Auto-generated constructor stub
	}

	public Emp(String name, String tel, String sabun, String buseo) {
		super(name, tel);
		this.sabun = sabun;
		this.buseo = buseo;
	}

	public String getSabun() {
		return sabun;
	}

	public void setSabun(String sabun) {
		this.sabun = sabun;
	}

	public String getBuseo() {  
		return buseo;
	}

	public void setBuseo(String buseo) {
		this.buseo = buseo;
	}
	//변수값을 출력하는 printInfo()
		public void printInfo() {
			super.printInfo();
			System.out.println("sabun="+sabun+",buseo="+buseo);
		}

}
