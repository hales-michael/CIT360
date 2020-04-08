import java.util.concurrent.atomic.AtomicInteger;

// import java.lang.Thread;

class threadDemo extends Thread {


	public void run() {

		try {
			
			System.out.println("Executing thread number " + Thread.currentThread().getId());
			System.out.println("Count is " + interrupt.count.incrementAndGet());
			
			
		}
		catch (Exception e)
		{
			System.out.println("An unknown error occurred");
			}
	}
	
}


	
	public class threads {	
	
		public static void main(String[] args) {
			

			System.out.println("Begin Main Thread...");

						
			

			
			for (int i=0; i<10; i++) {
				threadDemo thread = new threadDemo();
				thread.start();
		
			}
			
		
		 interrupt interruption = new interrupt(); interruption.executeInterrupt();
		 
	}
	}
	
	class interrupt {
		
		public static AtomicInteger count = new AtomicInteger();
		void executeInterrupt() {
			System.out.println("*** Interruption ***");
			for (int i=0; i<10; i++) {
				System.out.println("Interrupt number " + i);
				System.out.println("Count is " + interrupt.count.incrementAndGet());

				
			}
		}
	}


