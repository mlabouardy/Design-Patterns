package factory;

import model.Logger;
import model.XMLLogger;

public class XMLLoggerCreator extends AbstractLoggerCreator{

	@Override
	public Logger createLogger() {
		return new XMLLogger();
	}

}
