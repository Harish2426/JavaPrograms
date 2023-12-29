package Thread;

public class ThreadRunnableEx implements Runnable {
	

	public static void main(String[] args) {
		ThreadRunnableEx th = new ThreadRunnableEx();
		//Not making obj of Runnable becoz this is not supported in Interface.
		//Passing the object of user defined class inbuilt thread
		Thread t = new Thread(th);
		t.start();
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Thread Priority is "+t.getPriority());
		System.out.println("Thread is Executing");

	}
	public void run()
	{
		System.out.println("Thread is executed");
		
	}
}
