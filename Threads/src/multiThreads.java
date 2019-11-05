class irq extends Thread {
	@Override
	public void run() {
		for (int i=1;i<40;i++) {
			System.out.println("Interrupt item number: " + i);
		}
		
		System.out.println("*** Interrupt thread has completed ***");
	}
}





public class multiThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Begin Main Thread...");
		
		irq req1 = new irq();
		req1.start();
		
		for (int i=1; i<40; i++)
		{
			System.out.println("Main thread item number " + i);
		}

		System.out.println("*** Main thread has completed ***");
	}

}
