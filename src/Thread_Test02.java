import java.util.Scanner;

class download extends Thread {
	String name;

	public download(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println(name + " download start.");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {

		}
		System.out.println("download stop is " + name);

	}
}

public class Thread_Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		String[] programname = new String[7];
		String proname;
		int i = 0;

		System.out.println("프로그램 다운로드");
		System.out.println("최대 7개의 프로그램을 입력해서 다운받을수 있습니다.");
		System.out.println("d를 입력 하면 다운을 시작합니다. ");
		while (true) {
			System.out.println((i+1)+" 번째 프로그램 이름 입력 > ");
			name = sc.next();
			if (name.equals("d")) {
				System.out.println("===============");
				System.out.println("down start.");
				System.out.println("===============");
				break;
			} 
			else {
				programname[i] = name;
				i++;
			}
		}

		for (int j = 0; j < i; j++) {
			proname = programname[j];
			download start = new download(proname);
			start.start();
		}
	}
}
