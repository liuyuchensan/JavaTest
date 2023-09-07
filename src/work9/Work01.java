package work9;

public class Work01 implements Runnable {
	int counter = 1;
	private String name;
	Thread t;

	Work01(String name) {
		this.name = name;
		t = new Thread(this, name);
		t.start();
	}

	public void run() { 
		while (counter < 11) {
			System.out.println(name + "吃了第" + counter + "碗飯");
			counter++;
			int timer1 = (int) (Math.random() * 3000) + 500;

			try {
				Thread.sleep(timer1); 
			} catch (Exception e) {
			}
		}
		System.out.println(name + "  吃完了!");
	}

	public static void main(String arg[]) {
		String name = Thread.currentThread().getName();
		Work01 man1 = new Work01("詹姆士");
		Thread man1e = new Thread(man1); 
		Work01 man2 = new Work01("饅頭人");
		Thread man2e = new Thread(man2);
		System.out.println("------------大胃王快食比賽開始-------------");

		try {
			man1.t.join();
			man2.t.join();
			System.out.println("------------大胃王快食比賽開始-------------");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
