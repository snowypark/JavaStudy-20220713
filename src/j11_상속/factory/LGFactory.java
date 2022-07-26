package j11_상속.factory;

public class LGFactory extends Factory {

	public LGFactory(int factoryNumber) {
		super(factoryNumber);
	}

	@Override
	public void starts() {
		System.out.print("LG ");
		super.starts();
	}
	
	@Override
	public void stop() {
		System.out.print("LG ");
		super.stop();
	}
	

	public void produceSmartTV() {
		System.out.println("LG 스마트 TV를 생산합니다.");
	}
}
