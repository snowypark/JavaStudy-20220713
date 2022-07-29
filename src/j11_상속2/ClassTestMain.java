package j11_상속2;

public class ClassTestMain extends ClassA {

	public static void main(String[] args) {

		ClassB bb = new ClassB();
		ClassA aa = (ClassA) bb;
		// 업캐스팅 형변환

		ClassA aaa = new ClassB();

		((ClassA) bb).printInfo();

		ClassA b = new ClassB();
		b.printInfo();

		System.out.println("-----------");

		ClassA c = new ClassC();
		c.printInfo();
		c.showData();

	}

}
