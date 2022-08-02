package j14_lombok;

public class BuilderMain {
	public static void main(String[] args) {
		
		
		Builder builder = new Builder();
		Car car = builder.builder()
			.company("기아")
			.color("화이트")
			.build();
		
		System.out.println(car);
		
		System.out.println();
		
		Car car2 = new Car();
		car2.setColor("블랙");
		car2 = builder.company("검정").build();
		
		System.out.println(car2);
		
	}

}
