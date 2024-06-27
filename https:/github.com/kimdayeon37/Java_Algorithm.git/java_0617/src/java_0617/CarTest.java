package java_0617;

public class CarTest {

	public static void main(String[] args) {
		Car c = new Car();
		FlyCar fc = new FlyCar();
		fc.fly(); // 공식적 날기 
		// 공식적으로 하늘을 나르는 자동차들은 반드시 Flyable 타입이어야 한다 규정 
		Flyable fa = new FlyCar();
		fa.fly(); // 비공식적 날기 
	}

}
