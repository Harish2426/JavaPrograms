package Thread;
//threadExample class extends thread inbuilt class
public class ThreadExample extends Thread
{
	public void run() {
		System.out.println("This code is inside the thread");
	}

	public static void main(String[] args) {
		ThreadExample te = new ThreadExample();
		ThreadExample te1 = new ThreadExample();
		ThreadExample te2 = new ThreadExample();
		ThreadExample te3 = new ThreadExample();
		te3.start();
		te3.setPriority(MIN_PRIORITY);
		System.out.println("MINIMUM PRIORITY"+te3.getPriority());
		te.start();
		te.setPriority(MAX_PRIORITY);
		System.out.println("Maximum Priority Output "+te.getPriority());
		te1.start();
		te1.setPriority(NORM_PRIORITY);
		System.out.println("Normal Priority Output "+te1.getPriority());
		
//		te1.start();
//		te1.setPriority(1);
//		System.out.println("first priority");
//		
//		//te2.start();
//		te2.setPriority(2);
//		System.out.println("Second priority");
//		
		//te3.start();
		
		//te.start();
	
	}

}
