package singletonPattern;

public class ResourceManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintSpooler spooler=PrintSpooler.getInstance();
		
		Thread threadOne =new Thread(()->{PrintSpooler s=PrintSpooler.getInstance();});
		Thread threadTwo=new Thread(()->{PrintSpooler s=PrintSpooler.getInstance();});
		
		threadOne.start();
		threadTwo.start();
	}

}
