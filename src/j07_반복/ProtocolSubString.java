package j07_반복;

public class ProtocolSubString {

	public static void main(String[] args) {

		/*
		 * @뒤에 오는 문자열이 명령어 :뒤에 오는 문자열은 내용
		 * 
		 */

		String data = "@Message:안녕하세요.@To:김준일@From:김준이@SendDate:2022/07/21";
		String message = null;
		String to = null;
		String from = null;
		String sendDate = null;

		// @를 찾고 다음 @ 전까지 자름 2번째 @부터
		// :를 구분
		// 명령어 안에 옮기기
		// System.out.println(data.indexOf("@", 32)); = -1

		// if :를 찾으면 :-1까지 자르기
		// @를 찾으면 @+1부터 시작

		System.out.println();
		System.out.println("Message:" + message);
		System.out.println("To:" + to);
		System.out.println("From:" + from);
		System.out.println("SendDate:" + sendDate);
	}

}
