package j08_메소드;

public class Method1 {
	
	public static void printData(String data) {
								//지역 변수
								//매개 변수
		
		//공식 정의
		while (true) {         //매개 변수 사용
			int commandIndex = data.indexOf("@") + 1;
			int contentIndex = data.indexOf(":");
			int nextCommandIndex = data.indexOf("@", 1);

			String command = data.substring(commandIndex, contentIndex);
			String content = nextCommandIndex != -1 ? data.substring(contentIndex + 1, nextCommandIndex)
					: data.substring(contentIndex + 1);

			System.out.println(command + ": " + content);
			
			
			if(nextCommandIndex == -1) {
				break;
			}
			
			data = data.substring(nextCommandIndex);


		}
		
		System.out.println("--------------");
		System.out.println();
	}

	public static void main(String[] args) {

		String data = "@Message:안녕하세요.@To:김준일@From:김준이@SendDate:2022/07/21";
		String data2 = "@Message:안녕하세요.@To:김준일@From:김준이@SendDate:2022/07/21";
		String data3 = "@Message:안녕하세요.@To:김준일@From:김준이@SendDate:2022/07/21";
		
		//정의한 공식을 불러서 출력
		printData(data);
		printData(data2);
		printData(data3);
		

	}
}
