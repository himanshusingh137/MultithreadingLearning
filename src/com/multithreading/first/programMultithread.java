package com.multithreading.first;

public class programMultithread extends Thread {

	@Override
	public void run() {
		System.out.println("hello thread program ");
		System.out.println(Thread.currentThread().getName());
		Thread th = Thread.currentThread();
		try {
			System.out.println("try "+th.getName());
			th.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		programMultithread p1 = new programMultithread();
		p1.start();
//		try {
//			System.out.println("try "+p1.getName());
//			p1.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		programMultithread p2 = new programMultithread();
		p2.start();
	
	}

}
