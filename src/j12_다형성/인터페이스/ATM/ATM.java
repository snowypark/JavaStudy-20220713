package j12_다형성.인터페이스.ATM;

import j12_다형성.인터페이스.ConnectionTerminal;

public class ATM {

	private Accountconnection accountconnection;
	private ATM atm1;

	
	public ATM(Accountconnection accountconnection, ATM atm1) {
		this.atm1 = atm1;
	}
}
