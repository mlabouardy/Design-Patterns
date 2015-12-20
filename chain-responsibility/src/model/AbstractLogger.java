package model;

public abstract class AbstractLogger implements Logger {
	private LEVEL level;
	private Logger nextLogger;
	
	public AbstractLogger(LEVEL level){
		this.level=level;
	}

	@Override
	public void setLogger(Logger nextLogger) {
		this.nextLogger=nextLogger;
	}

	@Override
	public void logMessage(LEVEL level, String msg) {
		if(this.level.compareTo(level)==0){
			write(msg);
		}
		if(nextLogger!=null){
			nextLogger.logMessage(level, msg);
		}
	}

}
