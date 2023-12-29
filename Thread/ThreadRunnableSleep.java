package Thread;
//create 3 threads and use sleep method (sleep())
public class ThreadRunnableSleep
{
	public void run()
	{
		System.out.println("Thread is executed");
    }
	public static void main(String[] args)
	{
		ThreadRunnableEx th = new ThreadRunnableEx();
		//obj creation is not supported in interface
		//Passing the object of user defined class inbuilt thread
		Thread t0 = new Thread(th);
		Thread t1 = new Thread(th);
		Thread t2 = new Thread(th);
		//1ST THREAD
		t0.start();
		t0.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Thread(t0) Max Priority is "+t0.getPriority());
		try
		{
			t0.sleep(0);
		}
		catch(InterruptedException e ) 
		{
			System.out.println(e);
		}
		
		//1st thread is dead here join method will work now
		
		try 
		{
			t0.join(4000);
		}
		catch(InterruptedException e ) {
			System.out.println(e);
		}
		
		
		//2nd THREAD
		t1.start();
		t1.setPriority(Thread.NORM_PRIORITY);
		System.out.println("Thread (t1) Normal Priority is "+t1.getPriority());
		try {
		t1.sleep(800);
		}
		catch(InterruptedException e ) {
			System.out.println(e);
		}
		//2nd method will dead
		t2.start();
		t2.setPriority(Thread.MIN_PRIORITY);
		System.out.println("Thread(t2) Min Priority is "+t2.getPriority());
		try {
		t2.sleep(1500);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		
		//System.out.println("All Threads are Executing.... ");
		//

	}

}
