// import java.lang.Thread;

class threadDemo extends Thread {

	public void run() {
		
		try {
			System.out.println("Executing thread number " + Thread.currentThread().getId());
			
		}
		catch (Exception e)
		{
			System.out.println("An unknown error occurred");
			}
	}
	
}

class interrupt {
	void executeInterrupt() {
		System.out.println("*** Interruption ***");
		for (int i=0; i<10; i++) {
			System.out.println("Interrupt number " + i);
		}
	}
}
	
	public class threads {	
	
		public static void main(String[] args) {
			System.out.println("Begin Main Thread...");
			

			
			for (int i=0; i<10; i++)
			{
				threadDemo thread = new threadDemo();
				thread.start();
			}
			
			interrupt interruption = new interrupt();
			interruption.executeInterrupt();

	}
	}


