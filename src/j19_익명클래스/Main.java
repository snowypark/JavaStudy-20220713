package j19_익명클래스;

public class Main {
	
	/*
	 * J 패널
	 */

	public static void main(String[] args) {
		
		AbstractTest abstractTest = new AbstractTestImpl();
		
		abstractTest.add(10, 20);
		abstractTest.showData("JSON");
		
		
		//익명클래스로 만들기
		AbstractTest abstractTest2 = new AbstractTest() {
			
			@Override
			public void showData(String data) {
				System.out.println("여기에서만 사용가능한 data");
				
				
			}
			
			@Override
			public void add(int num1, int num2) {
				System.out.println("더할 때 딱한번 사용함.");
				
			}
		};
		
		abstractTest2.add(10, 40);
		abstractTest2.showData("A");

	}

}
