package j15_스태틱;

public class StaticMain {

	public static void main(String[] args) {
		
		StaticTest.name = "ㅁㅁㅁ";
	
		StaticTest staticTest = new StaticTest();
//		staticTest.name = "ㅇㅇㅇ";
//		
		System.out.println(staticTest.name);
		staticTest.printTest();
//
//		StaticTest staticTest2 = new StaticTest();
//		System.out.println(staticTest2.name);
//		
//		staticTest2.name = "ㄴㄴㄴ";
//		
//		System.out.println("1: " + staticTest2.name);
//		System.out.println("2: " + staticTest.name);
	}

}
