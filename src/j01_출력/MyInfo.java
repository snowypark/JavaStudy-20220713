package j01_출력;

public class MyInfo {

	public static void main(String[] args) {
		
		int age = 29;
		
		char name1 = '포';
		char name2 = '켓';
		char name3 = '몬';
		//char 자료형은 유니코드 \\u
		
		String address = "부산 동래구 사직동";
		String name = "김준일"+ "";
		
		System.out.println("결과:" + (10+20));
		
		System.out.println("" +name1 + name2 + name3);
		System.out.print("이름: ");
		System.out.println(name);
		System.out.print("나이: ");
		System.out.println(age);
		System.out.print("주소: ");
		System.out.println(address);
		System.out.println();
		
		
	}

}
