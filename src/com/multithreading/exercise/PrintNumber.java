package com.multithreading.exercise;

public class PrintNumber implements Runnable {

	@Override
	public void run() {
		
		for(int i=1 ; i<=20 ; i++) {
			System.out.println("Background Thread: " +i);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
}
