/*
 * 
 */
package Task_17;

class sum_thread {
	public static void main(String[] args) {
		M a = new M();

		a.start();

	}
}

class M extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}
}