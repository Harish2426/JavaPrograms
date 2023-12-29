package Thread;

public class JoinExample {

	public static void main(String[] args) {
		  Thread thread1 = new Thread(new MyRunnable("Thread 1"));
	        Thread thread2 = new Thread(new MyRunnable("Thread 2"));

	        thread1.start();
	        thread2.start();

	        try {
	            // Using join to wait for thread1 to finish
	            thread1.join();
	            System.out.println("Thread 1 has finished.");

	            // Using join with a timeout for thread2
	            thread2.join(5000);
	            System.out.println("Thread 2 has finished or 5 seconds have passed.");
	        } 
	        catch (InterruptedException e) 
	        {
	            e.printStackTrace();
	        }

	        System.out.println("Main thread exiting.");
	    }
	}

	class MyRunnable implements Runnable 
	{
	    private String name;

	    public MyRunnable (String name) 
	    {
	        this.name = name;
	    }

	    public void run() 
	    {
	        for (int i = 1; i <= 5; i++) 
	        {
	            System.out.println(name + ": Count - " + i);
	            try 
	            {
	                Thread.sleep(5000);
	            } catch (InterruptedException e) 
	            {
	                e.printStackTrace();
	            }
	        }
	    }
	}