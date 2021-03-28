package com.java.multithreading.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CustomTask implements Runnable {

	private CyclicBarrier cb;

	public CustomTask(CyclicBarrier cb) {
		this.cb = cb;
	}

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName() + " has arrieved..");
		try {
			cb.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}

		System.out.println(Thread.currentThread().getName() + " is ready to onboard..");
	}
}
