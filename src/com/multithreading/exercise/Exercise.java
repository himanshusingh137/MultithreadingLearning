package com.multithreading.exercise;

public class Exercise {

	public static void main(String[] args) { 
		
		PrintNumber bg = new PrintNumber();
		
		Thread background = new Thread(bg);
		
		PrintLetter prll = new PrintLetter();
		
		Thread parallel = new Thread(prll);
		
		background.setName("background thread");
		parallel.setName("parallel thread");
		
		background.start();
		parallel.start();

	}

}
