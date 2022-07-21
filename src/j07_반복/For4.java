package j07_반복;

public class For4 {

	public static void main(String[] args) {

		String address = "부산 동래구 사직동 중앙대로";

		for (int i = 0; i < address.length(); i++) {
			String subStr = address.substring(i, i + 1); // 한 글자씩 자름

			if (subStr.equals(" ")) { // 띄어쓰기인지 확인
				int index = 0; // true일 경우 index 초기화
				String temp = address.substring(0, i);
				// 기존 문자열 substring 0, i번(띄어쓰기까지)

				if (temp.contains(" ")) { // 문자열에 띄어쓰기 포함 확인
					index = temp.lastIndexOf(" ") + 1;
					// 마지막 문자열부터 공백 찾기(역순)
					System.out.println(temp.substring(index, i));
					
				} else { 
					//마지막 문자열 끝에 띄어쓰기가 없어서 새로운 조건
					//뒤에서 공백 발견시 +1의 위치에서부터 자르기
					index = temp.lastIndexOf(" ") + 1;
					System.out.println(temp.substring(index, i));
				}

			}
			if (i == address.length() - 1) {
				System.out.println(address.substring(address.lastIndexOf(" ") + 1));
			}

		}

	}
}
