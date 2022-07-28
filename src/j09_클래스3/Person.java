package j09_클래스3;

public class Person {

	private String name;
	private int age;

	public Person() {
	}

	public Person(String name, int age) {

		this.name = name;
		this.age = age;
	}
	
	public void test() {
		String name = "ㅇㅇㅇ";
		System.out.println("this.name");
	}
	
	public void setName() {
		this.name = name;
	}
	
	 public String getName() {
		 return name;
	 }

}
