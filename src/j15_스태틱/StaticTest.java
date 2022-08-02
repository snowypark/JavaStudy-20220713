package j15_스태틱;

public class StaticTest {
			//static - 클래스에서 생성
			//해당 클래스에서 만들어지면 공유
	
	public static String name;
	private int age;
	//메모리 할당X
	
	public static void printTest() {
		System.out.println("출력");
		System.out.println(name);
		
	}

}
