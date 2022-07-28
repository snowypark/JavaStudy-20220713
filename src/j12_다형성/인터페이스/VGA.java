package j12_다형성.인터페이스;

public interface VGA extends ConnectionTerminal{
	
	public String VERSION = "DDC=2";
	
	public void connect();
	public void disConnect();

}
