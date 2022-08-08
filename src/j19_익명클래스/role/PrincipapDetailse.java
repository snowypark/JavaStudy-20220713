package j19_익명클래스.role;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data

//권한 관리 단위 role

public class PrincipapDetailse {	
		
		@NonNull
		private User user;
		
						//상속 받은 것들만
		public Collection<? extends GrantedAuthority> getAuthorities() {
			Collection<GrantedAuthority> authorities = 
					new ArrayList<GrantedAuthority>();
			
			//method
			user.getRoleList().forEach(r -> {
				authorities.add(() -> r);
				});
				
				return authorities;					
		}
		

		
		
		public String getUsername() {
			return user.getUsername();
		}
		
		public String getPassword() {
			return user.getPassword();
		}
		
		
		
//		String strRoles = "USER_ROLE, ADMIN_ROLE, MANAGER_ROLE";
//		
//		strRoles = strRoles.replaceAll(",", "");
//		
//		String[] roleArray = strRoles.split(",");
//		
//				
//		String[] roleArray = strRoles.replaceAll(" ", "").split(",");
//		
//		for(String role : roleArray) {
//			System.out.println(role);
//		}
//		
//		List<String> roles = new ArrayList<String>();
//		roles.addAll(Arrays.asList(roleArray));
//		
//		System.out.println(roles);
//		
//		Collection<String> roleData = new GrantedAuthority() {
//			
//			@Override
//			public Collection<String> getRoles(List<String> roles) {
//				List<String> roleList = new ArrayList<String>();
//				roleList.addAll(roles);
//				return roles;
//			}
//		}.getRoles(roles);
//		
//		System.out.println(roles);
			
		
	

}
