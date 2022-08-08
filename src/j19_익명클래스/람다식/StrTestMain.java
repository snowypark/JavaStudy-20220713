package j19_익명클래스.람다식;

import java.util.function.Function;

public class StrTestMain {

	public static void main(String[] args) {
			
		StrTest name = (str) -> str + "님";
			
		System.out.println(name.test("ji"));
			
		StrTest strGrade = (score) -> {
			
			if(score.equals("90")) {
				return "A";
			}else if(score.equals("80")) {
				return "B";
			}else {
				return "F";
			}
		};
		
		String grade = strGrade.test("80");
		System.out.println(grade);
		
		Function<Integer, String> f = (num) -> Integer.toString(num);
		System.out.println(f.apply(100));
		
	}

}
