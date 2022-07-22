package j09_클래스.생성자;

public class CarMain {

	public static void main(String[] args) {
		
		
		Car car1 = new Car("현대자동차", "그레이", "아반떼");
		Car car2 = new Car("현대자동차", "화이트", "소나타");
		Car car3 = new Car("기아", "k5", "블랙");
		
		car1.showCarInfo();
		car2.showCarInfo();
		car3.showCarInfo();
		
		

	}

}
