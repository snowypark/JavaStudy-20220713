package j19_익명클래스.role;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class User {

	private String username;
	private String password;
	private String rolse;
	
				//String -> grantedAuthoiry
	public List<String> getRoleList(){
		if(this.rolse.length() > 0) {
			return Arrays.asList(this.rolse.replace(" ", "").split(","));
		}
		return new ArrayList<String>();
	}
	
	
	
}
