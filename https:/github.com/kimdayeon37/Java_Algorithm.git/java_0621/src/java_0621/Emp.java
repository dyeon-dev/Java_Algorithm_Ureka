package java_0621;

/** 사원 */
public class Emp implements Comparable<Emp>{
	int sabun;
	String name;
	
	public Emp() {
		
	}


	public Emp(int sabun, String name) {
		super();
		this.sabun = sabun;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Emp [sabun=" + sabun + ", name=" + name + "]";
	}


	@Override
	public int compareTo(Emp o) {

		return this.sabun-o.sabun;
	}

}
