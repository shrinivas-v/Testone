package Check;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j {
	
	static Logger logger = LogManager.getLogger(Log4j.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n Test.... \n");
		
		logger.trace("Trace it");
		logger.info("Logged in");
		logger.error("Error!!");
		logger.warn("Warning!!!!");
		logger.fatal("FATAL ERROR");
		
		System.out.println("\n  END... \n");
		
	}

}
