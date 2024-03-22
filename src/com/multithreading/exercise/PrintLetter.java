package com.multithreading.exercise;

public class PrintLetter implements Runnable {
	
	@Override
	public void run() {
		
		String word = "HimanshuSinghParmarSurauthiBariDholpur";
		
		for(int i=0 ; i<= word.length() -1  ; i++) {
			
			System.out.println("Parallel Thread: "+ word.charAt(i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
