/*
 * 
 */
package Task_16;

class sum_thread {
	public static void main(String[] args) {
		T a = new T();

		a.start();

	}
}

class T extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}
}