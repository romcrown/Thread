import java.util.ArrayList;

class tests implements Runnable{
	private int index = 0;
	
	public void run() {
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		addIndex();
	}
	synchronized void addIndex(){
		index++;
		System.out.println("current index value: " + index);
	}

}


public class Thread_Runnabel_exam02 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("mian thread start.");
		
		Runnable r = new tests();
		
		ArrayList<Thread> list = new ArrayList<Thread>();
		
		for(int i = 0 ; i < 10 ; i++) {
			Thread t = new Thread(r);
			t.start();
			list.add(t);
		}
		
		for(Thread te : list) {
			te.join();
		}
	System.out.println("main thread end.");	
	}
}
