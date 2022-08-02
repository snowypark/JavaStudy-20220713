package j15_스태틱;

public class MainStaticTest {
	
	
	public void printTest() {
		System.out.println("출력");
	}
	
	
	
	public static void main(String[] args) {
		
		
		MainStaticTest mainStaticTest = new MainStaticTest(); //객체 생성
		mainStaticTest.printTest(); 						  //호출 가능			
		
	}

}
