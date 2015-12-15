package app;

import factory.AbstractLoggerCreator;
import factory.XMLLoggerCreator;
import model.Logger;

public class Main {

	public static void main(String[] args) {
		AbstractLoggerCreator log=new XMLLoggerCreator();
		Logger logger=log.createLogger();
		logger.log("ok");
	}

}
