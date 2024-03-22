package com.multithreading.first;

public class Demo1 {
	
	static {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName());
		System.out.println(thread);
	}
	
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName());
		System.out.println(thread);
		thread.setPriority(7);
		thread.setName("my thread");
		try {
			thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(thread.getName());
		System.out.println(thread);
	}

}
