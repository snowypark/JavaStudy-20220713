package j07_반복;

public class ProtocolSubstringA {
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

		while (true) {
			int commandIndex = data.indexOf("@") + 1; // @다음부터
			int contentIndex = data.indexOf(":"); // :의 위치

			int nextCommandIndex = data.indexOf("@", 1);
			// int nextCommandIndex = data.indexOf(("@"), 1); = -1

			String command = data.substring(commandIndex, contentIndex);
			// @ 다음부터 : 전까지
			String content = nextCommandIndex != -1 ? data.substring(contentIndex + 1, nextCommandIndex)
					: data.substring(contentIndex + 1);
			// @가 없는 -1일 경우

			System.out.println(command);
			System.out.println(content);
			
			System.out.println();
			System.out.println(command + ": " + content);
			System.out.println();

			if (command.equals("Message")) {
				message = content;

			} else if (command.equals("To")) {
				to = content;

			} else if (command.equals("From")) {
				from = content;

			} else if (command.equals("SendDate")) {
				sendDate = content;
			}

			if (nextCommandIndex == -1) {
				break;
			}

			data = data.substring(nextCommandIndex);

		}

	}
}
