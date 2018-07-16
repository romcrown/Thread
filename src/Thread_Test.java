import java.util.Scanner;

public class Thread_Test extends Thread {
	
	int In;
	String Str;

	// 은행 이름.
	public Thread_Test(String Str) {
		this.Str = Str;
	}

	public void run() {
		System.out.println( this.Str );
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		input in = new input();
		String[] Array = { "국민은행 금리 2.4%", "우리은행 금리 2.1%", "하나은행 금리 1.9%", "기업은행 금리 2.2%", "농협은행 금리 2.3%",
				"외한은행 금리 2.1%" };

		System.out.println("입금할 돈의 액수를 입력해주세요.");
		int num = in.Intscan();

		for (int i = 0; i < Array.length; i++) {
			Thread_Test thr = new Thread_Test(Array[i]);
			thr.start();
		}
	}
}

class input {

	Scanner sc = new Scanner(System.in);

	public int Intscan() {
		int in = sc.nextInt();
		return in;
	}

	public String Strscan() {
		String Str = sc.nextLine();
		return Str;
	}
}
