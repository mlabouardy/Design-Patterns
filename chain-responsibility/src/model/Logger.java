package model;

public interface Logger {
	
	public void write(String msg);
	public void setLogger(Logger logger);
	public void logMessage(LEVEL level, String msg);

}
