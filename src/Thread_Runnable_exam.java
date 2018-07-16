
class test implements Runnable{
	
	int num;
	
	public void test(int num) {
		this.num = num;
	}
	
	public void run() {
		System.out.println(this.num+" thread start");
		try {
			Thread.sleep(2000);
		}
		catch(Exception e) {
	
		}
		System.out.println(this.num+" thread end");
	}
}

public class Thread_Runnable_exam {
	public static void main(String[] args) {

		System.out.println("main thread start");
		
		for (int i = 0 ; i < 14 ; i ++) {
			test s = new test();	
			Thread thr = new Thread(s);
			s.test(i);
			thr.start();
		}
		System.out.println("mian thread end");
	}

}
