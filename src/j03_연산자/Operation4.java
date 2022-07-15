package j03_연산자;

public class Operation4 {

	public static void main(String[] args) {
		
		/*
		 * 윤년
		 * 해당 년도가 4의 배수이고,
		 * 100의 배수가 아니거나 400의 배수일때
		 */
		
		int year = 1999;
		String result = year % 4 == 0 
				&& (year % 100 != 0 || year % 400 == 0) ? "윤년" 
						: "윤년아님";
		
		boolean result2 = year % 4 == 0 
				&& (year % 100 != 0 || year % 400 == 0) ? true 
						: false;
		
		System.out.println(result);
		System.out.println(result2);
		
		System.out.println(year > 2000 ? "2000보다 큼" 
				: year > 1000 ? "1000보다 큼" 
				: year > 500 ? "500보다 큼" 
				: "500 이하");

	}

}
