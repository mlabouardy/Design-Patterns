package model;

public class DebugLogger extends AbstractLogger{

	public DebugLogger(LEVEL level) {
		super(level);
	}

	@Override
	public void write(String msg) {
		System.out.println("DEBUG:"+msg);
	}

}
