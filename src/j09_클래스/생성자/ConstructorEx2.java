package j09_클래스.생성자;

public class ConstructorEx2 {

	String name;
	int age;
	// 생성자 자동 생성
	// Atl + Shift + S
	// Generate Construct usig Field

	public ConstructorEx2() {
		// TODO Auto-generated constructor stub
	}

	public ConstructorEx2(String name) {

		this.name = name;
	}

	public ConstructorEx2(int age) {
		this.age = age;
	}

	public ConstructorEx2(String name, int age) {
		this.name = name;
		this.age = age;
	}

}
