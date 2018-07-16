
public class Thread_exam extends Thread { // thread 는 Thread 를 상속 받아서 만든다.
	//thread 는 프로그램의 순서에 상관없이 동시에 실행하고 싶을떄 사용하면 유용한 기술.
	//thread 는 재활용이 불가능하다.
	int thr;
	
	public Thread_exam(int i) {
		this.thr = i;
	}

	public void run() {
		System.out.println(this.thr+" Thread start");
		try {
			Thread.sleep(1000);
			
		}catch(Exception e) {
			
		}
		System.out.println(this.thr+" Thread end");
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Thread_exam st = new Thread_exam(i);
			st.start(); //run 메소드를 만들어 야지 실행이 가능하다.
		}
		System.out.println("main thread end");
	}

}
