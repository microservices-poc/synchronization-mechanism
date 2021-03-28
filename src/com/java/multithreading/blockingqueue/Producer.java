package com.java.multithreading.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	BlockingQueue<String> bq;

	public Producer(BlockingQueue<String> bq) {
		this.bq = bq;
	}

	@Override
	public void run() {
		System.out.println("Processing 10 orders.");

		for (int j = 0; j < 10; j++) {
			try {
				bq.put("String - " + j);
				System.out.println("Cooking for order " + j + " is in progress.");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("All orders are processed.");

		try {
			bq.put("Stop");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
