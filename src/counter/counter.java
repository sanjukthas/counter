package counter;

public class counter implements Runnable {

	@Override
	public void run() {
		Thread ct =Thread.currentThread();
		int count =1;
		System.out.println("Time begins");
	

	while(true){
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			break;
		}
		System.out.println("Elapsed time : "+ count +"second");
		count++;
		}
	System.out.println("User paused the timer:");
}
			
}	
	
	

