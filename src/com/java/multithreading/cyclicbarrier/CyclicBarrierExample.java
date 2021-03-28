package com.java.multithreading.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {

	public static void main(String[] args) throws InterruptedException {
		CyclicBarrier cb = new CyclicBarrier(3);

		for (int i = 0; i < 9; i++) {
			Thread t = new Thread(new CustomTask(cb));
			t.setName("Thread - " + i);
			t.start();
			t.sleep(2000);
		}

	}

}
