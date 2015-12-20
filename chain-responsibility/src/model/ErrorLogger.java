package model;

public class ErrorLogger extends AbstractLogger{

	public ErrorLogger(LEVEL level) {
		super(level);
	}

	@Override
	public void write(String msg) {
		System.out.println("Error:"+msg);
	}

}
