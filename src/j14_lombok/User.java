package j14_lombok;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

//@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor

public class User {
	
	
	private String email;
	private String name;
//	@NonNull  //필수로 있어야 하는 값 != fianl (둘은 다름!)
	private String username;
//	@NonNull
	private String password;
	
	
//	public User(String username, String password) {
//		this.username = password;
//		this.password = password;
//	}

}
