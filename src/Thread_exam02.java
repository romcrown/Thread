import java.util.ArrayList;

public class Thread_exam02 extends Thread {
	int thread;

	public Thread_exam02(int thread) {
		this.thread = thread;
	}

	public void run() {
		System.out.println(this.thread + " thread start.");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {

		}
		System.out.println(this.thread + " thread end");
	}

	public static void main(String[] args) {
		ArrayList<Thread> thr = new ArrayList<Thread>();

		for (int i = 0; i < 10; i++) {
			Thread th = new Thread_exam02(i);
			th.start();
			thr.add(th);
		}
		for (int i = 0; i < thr.size(); i++) {
			Thread t = thr.get(i);
			try {
				t.join();
			} catch (Exception e) {

			}
		}
		System.out.println("main thread end");
	}

}
