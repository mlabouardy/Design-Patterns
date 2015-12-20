package app;

import model.DebugLogger;
import model.ErrorLogger;
import model.LEVEL;
import model.Logger;

public class Main {

	public static void main(String[] args) {
		Logger logger=new ErrorLogger(LEVEL.ERROR);
		logger.setLogger(new DebugLogger(LEVEL.DEBUG));
		logger.logMessage(LEVEL.DEBUG, "hello");
		
	}

}
