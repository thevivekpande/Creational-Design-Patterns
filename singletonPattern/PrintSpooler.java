package singletonPattern;

public class PrintSpooler {
	private static PrintSpooler spooler;
	private static boolean initialized =false;
	private PrintSpooler() {
		
	}
	
	private void init() {
		
	}
	public static synchronized PrintSpooler getInstance() {
		if(initialized) return spooler;
		spooler =new PrintSpooler();
		spooler.init();
		initialized=true;
		return spooler;
	}

	
}
