
public class AsteriskLogger implements Logger{

	@Override
	public void log(String evan) {
		System.out.println("***" + evan + "***");
		
	}

	@Override
	public void error(String yoyo) {
		System.out.println("********************");
		System.out.println("***Error: " + yoyo + "***");
		System.out.println("********************");
		
		
	}

	

}