package com.java.multithreading.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class FoodProcessor implements Runnable {
	private CountDownLatch cdl;
	private String[] items;

	public FoodProcessor(CountDownLatch cdl, String[] args) {
		this.cdl = cdl;
		this.items = args;
	}

	@Override
	public void run() {
		for(String item : items) {
			System.out.println("Before processing order countdownlatch value :"+ cdl.getCount());
			try {
				Thread.sleep(2000);
				cdl.countDown();
				System.out.println("Processing item : "+ item);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}						
			System.out.println("After processing order countdownlatch value :"+ cdl.getCount());
		}
		System.out.println("All items are processed..");
	}

}
