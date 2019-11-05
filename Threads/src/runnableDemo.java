
public class runnableDemo implements Runnable {

	@Override
	public void run() {

		for (int i=1;i<10;i++) {
			System.out.println(Thread.currentThread().getName() + ", item number " + i );
		}

	}
	
	
    public static void main(String[] args) {
    	
        System.out.println("Begin demo...");
        
        runnableDemo r = new runnableDemo();
        
        
        Thread thread1 = new Thread(r, "Thread 1");
        thread1.start();
        
        Thread thread2 = new Thread(r, "Thread 2");
        thread2.start();
        
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                
                // We are doing the same thing as with the MyRunnableImplementation class
                for (int i=1;i<10;i++) {
                    System.out.println(Thread.currentThread().getName() +
                            ", item number " + i);
                }
            }
        }, "Thread 3");
        thread3.start();
        	}
        
        
        

}

