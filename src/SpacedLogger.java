public class SpacedLogger implements Logger{

	@Override
	public void log(String evan) {
		System.out.println(evan.replace("", " "));
	}

	@Override
	public void error(String yoyo) {
		System.out.println("Error: " +  yoyo.replace("", " "));
		
	}

	
}