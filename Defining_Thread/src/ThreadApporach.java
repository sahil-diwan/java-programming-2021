
class MyThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			System.out.println("Child Thread");
		}
	}
}
public class ThreadApporach {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		for(int i=0;i<10;i++){
			System.out.println("Main Thread");
		}
		
	}
}
