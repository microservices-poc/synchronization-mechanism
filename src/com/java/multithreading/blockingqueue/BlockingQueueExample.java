package com.java.multithreading.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {

	public static void main(String[] args) {

		BlockingQueue<String> bq = new ArrayBlockingQueue<>(3);

		Producer producer = new Producer(bq);
		Consumer consumer = new Consumer(bq);
		new Thread(producer).start();
		new Thread(consumer).start();

	}

}
