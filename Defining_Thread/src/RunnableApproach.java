
class MyRunnable implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			System.out.println("Child Thread");
		}
	}
}
public class RunnableApproach {

	public static void main(String[] args) {
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r); // Passing the target runnable else it will call Thread class run method. 
		t.start();
		for(int i=0;i<10;i++){
			System.out.println("Main Thread");
		}
	}
}
