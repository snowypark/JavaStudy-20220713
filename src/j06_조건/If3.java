package j06_조건;

public class If3 {

	public static void main(String[] args) {
		
		//사분면 고르기
		
		int x = 2;
		int y = -2;
		String result = null;
		
		if(x > 0 && y > 0) {
			result = "제1사분면";
		}else if(x < 0 && y > 0) {
			result = "제2사분면";
		}else if(x < 0 && y < 0) {
			result = "제3사분면";
		}else {
			result = "제4사분면";
		}
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("결과: " + result);
		
	}

}
