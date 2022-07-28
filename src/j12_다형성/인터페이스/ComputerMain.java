package j12_다형성.인터페이스;

import java.util.Scanner;

import j12_다형성.인터페이스.usb.KeyBoard;
import j12_다형성.인터페이스.usb.Mouse;
import j12_다형성.인터페이스.usb.USB;

public class ComputerMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // 스캐너 객체
				
		String select = null; // 메뉴 선택 저장
		
		ConnectionTerminal connectionTerminal = null;
		
		System.out.println("[컴퓨터 전원 관리]");
		System.out.println("1. 모니터 연결");
		System.out.println("2. 빔프로젝트 연결");
		System.out.println("선택 >> ");
		
		
		select = scanner.nextLine(); // 번호 입력
		
		
		if(select.equals("1")) {
			connectionTerminal = new Monitor(); 
			// 모니터 객체 생성 -> connectionTerminal 변수에 대입
			// 자료형이 다름 -> 캐스팅
			
		}else if(select.equals("2")) {
			connectionTerminal = new BeamProject(); 
			
		}else {
			System.out.println("메뉴를 잘 못 선택하셨습니다.");
		}
		
		
		HDMI monitor = new Monitor();
		BeamProject beamProject = new BeamProject();
		
		
		Computer computer = new Computer(connectionTerminal, 
				new Mouse(), new KeyBoard());
		
		
		computer.powerOn();
		
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		computer.powerOFF();
		
	}

}
