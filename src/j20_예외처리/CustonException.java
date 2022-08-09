package j20_예외처리;


import lombok.NoArgsConstructor;

@NoArgsConstructor

public class CustonException extends RuntimeException {
			//add default serialnumber

	private static final long serialVersionUID = 1L;
	
	private String errorMessage;
	
	public CustonException(String errorMessage) {
		super(errorMessage);
		this.errorMessage = errorMessage;
	}

	@Override
	public void printStackTrace() {
		System.out.println("우리가 만든 예외가 발생했습니다.");
		System.out.println("메세지 내용은 아래를 참고하세요.");
		super.printStackTrace();
	}
	
	
	

}
