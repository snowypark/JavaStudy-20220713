package j09_클래스;

public class CarMain {
	
	/*
	 * 클래스 Car 
	 * 변수
	 * 		company
	 * 		model
	 * 		color
	 * 
	 * 메소드
	 * 		showCarInfo()
	 * 			회사명: 
	 * 			모델명:
	 * 			색상:
	 * 
	 * 3대
	 * 현대자동차, 쏘나타, 화이트
	 * 기아, k5, 블랙
	 * 현대자동차, 아반떼, 그레이
	 */

	public static void main(String[] args) {
		
		System.out.println((new Car()));
		
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		car1.color = "화이트";
		car1.model = "쏘나타";
		car1.compnay = "현대자동차";
		
		car2.color = "블랙";
		car2.model = "k5";
		car2.compnay = "기아";
		
		car3.color = "그레이";
		car3.compnay = "현대자동차";
		car3.model = "아반떼";
		
		car1.showCarInfo();
		car2.showCarInfo();
		car3.showCarInfo();
		
		
		

	}

}
