package com.java.multithreading.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {

	public static void main(String[] argss) {
		
		String[] args = {"Pizza","Chicken pasta","Burger"};

		final CountDownLatch cdl = new CountDownLatch(args.length);
		Thread t = new Thread(new FoodProcessor(cdl, args));
		t.start();

		System.out.println("Processing order..");
		try {
			cdl.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("All orders are processed and ready for dispatch..");

	}

}
