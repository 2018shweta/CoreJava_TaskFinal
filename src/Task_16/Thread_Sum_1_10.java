/*
 * Create 1 thread that find sum of 1 to 100 and print sum. 
 */
package Task_16;

public class Thread_Sum_1_10 {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		b.start();
		c.start();
		a.start();

	}
}

class A extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}
}

class B extends Thread {
	@Override
	public void run() {
		int sum = 0;
		for (int i = 0; i < 50; i++) {
			sum = sum + i;
		}

		for (int i = 0; i < 50; i++) {
			System.out.println("sum pf 0 to 50    " + sum);
		}
	}
}

class C extends Thread {
	@Override
	public void run() {
		int sum = 0;
		for (int i = 51; i < 100; i++) {
			sum = sum + i;
		}

		for (int i = 51; i < 100; i++) {
			System.out.println("Sum of 51 to 100    " + sum);
		}

	}
}
