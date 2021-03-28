package com.java.multithreading.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	
	BlockingQueue<String> bq;
	String msg;

	public Consumer(BlockingQueue<String> bq) {
		this.bq = bq;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
			while(!(msg = bq.take()).equals("Stop")) {
				System.out.println("Consumed order "+ msg);
				Thread.sleep(2000);
			}
			System.out.println("All orders are consumed.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
