package j02_변수와상수;

public class Cast {

	public static void main(String[] args) {
		//코드의 가독성 -> 띄어쓰기 = 클린코드
		//char -> int -> double
		//byte -> shot -> int -> long -> float -> double
		
		char a = '가';
		int b = a;
		double c = b;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		int d = (int) c;
		char e = (char) d;
		
		System.out.println(d);
		System.out.println(e);

	}

}
