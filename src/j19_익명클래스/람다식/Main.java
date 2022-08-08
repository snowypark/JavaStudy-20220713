package j19_익명클래스.람다식;

public class Main {

	public static void main(String[] args) {
				
		Math<Integer, Integer> plusMath = new Math<Integer, Integer>(){
			//int 자료형
			
			@Override
			public double calc(Integer value1, Integer value2) {
				
				return value1 + value2;
			}
		};
		
		System.out.println(plusMath.calc(10, 30));
	
		
		Math<Double, Double> plusMath2 = new Math<Double, Double>() {
			//double 자료형 새로 정의
			
			@Override
			public double calc(Double value1, Double value2) {
				
				System.out.println("value1: " + value1);
				System.out.println("value2: " + value2);
				
				return value1 + value2;
			}
		};
		
		System.out.println(plusMath2.calc(100.5, 200.5));
				
		
		//람다식						//calc		return
		Math<Double, Double> plusMath3 = (v1, v2) -> { //익명클래스
			System.out.println("v1: " + v1); 
			System.out.println("v2: " + v2);
			return v1 + v2;
		};  // {중괄호} 사용시 return 필수
		
		
		
		
		Math<Double, Double> plusMath4 = (v1, v2) -> v1 + v2;
		
		System.out.println(plusMath4);
		
		System.out.println(plusMath3.calc(10.1, 30.3));
		
	}

}
