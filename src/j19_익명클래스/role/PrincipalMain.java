package j19_익명클래스.role;

public class PrincipalMain {
	
	public static void main(String[] args) {
		
		User user = User.builder()
				.username("junil")
				.password("1234")
				.rolse("ROLE_USER,ROLE_ADMIN,ROLE_MANAGER")
				.build();
		
		User user2 = User.builder()
				.username("junil2")
				.password("1111")
				.rolse("ROLE_USER")
				.build();
		
		
		PrincipapDetailse principapDetailse = new PrincipapDetailse(user);
		PrincipapDetailse principapDetailse2 = new PrincipapDetailse(user2);
		
		printPrincipalData(principapDetailse);
		printPrincipalData(principapDetailse2);
		
		
		
	}
	
	public static void printPrincipalData(PrincipapDetailse principapDetailse) {
		System.out.println("[ principal 정보 출력 ]");
		System.out.println("username: " + principapDetailse.getUsername());
		System.out.println("password: " + principapDetailse.getPassword());
		
		for(GrantedAuthority grantedAuthority : principapDetailse.getAuthorities()) {
			System.out.println("권한: " + grantedAuthority.getAuthority());
		}
		System.out.println();
	}

}
