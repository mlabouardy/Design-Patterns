package factory;

import model.Logger;

public abstract class AbstractLoggerCreator {

	public abstract Logger createLogger();
	
	public Logger getLogging(){
		return createLogger();
	}
}
