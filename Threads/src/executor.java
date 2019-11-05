import java.util.concurrent.*;

class ThreadRunner implements Runnable {
	
	private String command;
	
	public ThreadRunner(String s) {
		this.command = s;
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Start. Command = " + command);
		processCommand();
		System.out.println(Thread.currentThread().getName() + " End.");
		
	}
	
	private void processCommand() {
		try {
			Thread.sleep(5000);
			
		} catch (Exception e) {
			System.out.println("An unknown error occurred.");
		}
	}
	
	@Override
	public String toString() {
		return this.command;
	}
}





public class executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		for (int i=0;i<10;i++) {
			Runnable runner = new ThreadRunner("" + i);
			executor.execute(runner);
		}
		
		executor.shutdown();
		while (!executor.isTerminated()) {
		}
		System.out.println("Finished all threads");
		}
		
		

	}


