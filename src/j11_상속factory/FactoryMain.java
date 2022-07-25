package j11_상속factory;

public class FactoryMain {

	public static void main(String[] args) {

		SamsungFactory[] samsungFactories = new SamsungFactory[3];
		samsungFactories[0] = new SamsungFactory(1);
		samsungFactories[1] = new SamsungFactory(2);
		samsungFactories[2] = new SamsungFactory(3);

		LGFactory[] lgFactories = new LGFactory[3];

		lgFactories[0] = new LGFactory(1);
		lgFactories[1] = new LGFactory(2);
		lgFactories[2] = new LGFactory(3);

		for (int i = 0; i < samsungFactories.length; i++) {
			System.out.println("삼성 공장 가동");
			samsungFactories[i].starts();
		}
		
		System.out.println("삼성 공장 중지");
		
		for (int i = 0; i < samsungFactories.length; i++) {
			samsungFactories[i].stop();
		}

		System.out.println();

		for (int i = 0; i < lgFactories.length; i++) {
			System.out.println("LG 공장 가동");
			lgFactories[i].starts();
		}

	}

}
