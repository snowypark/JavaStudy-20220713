package j15_스태틱.싱글톤;

public class SingletonMain {

	public static void main(String[] args) {
		
		KIA kia = KIA.getInstance();
		KIA kia2 = KIA.getInstance();
		KIA kia3 = KIA.getInstance();
		KIA kia4 = KIA.getInstance();
		KIA kia5 = KIA.getInstance();

			
		System.out.println(kia.produceCar("K3"));
		System.out.println(kia.produceCar("K3"));
		System.out.println(kia.produceCar("K3"));
		System.out.println(kia.produceCar("K3"));
		System.out.println(kia.produceCar("K3"));
		
		KIA.getInstance();
		
		Test1 test1 = new Test1();
		Test2 test2 = new Test2();
		Test3 test3 = new Test3();
	}
	
}
