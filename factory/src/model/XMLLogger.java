package model;

public class XMLLogger implements Logger{

	@Override
	public void log(String msg) {
		System.err.println("loggin");
	}

}
