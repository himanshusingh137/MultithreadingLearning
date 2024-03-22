package com.multithreading.exercise;


public class Demo {
    public static void main(String[] args) {
        Thread backgroundThread = new Thread(new BackgroundTask());
        Thread parallelThread = new Thread(new ParallelTask());

        backgroundThread.start();
        parallelThread.start();
    }

    static class BackgroundTask implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 20; i++) {
                System.out.println("Background Thread: " + i);
                try {
                    Thread.sleep(5000); // Sleep for 5 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class ParallelTask implements Runnable {
        @Override
        public void run() {
            String word = "Working";
            for (int i = 0; i < word.length(); i++) {
                System.out.println("Parallel Thread: " + word.charAt(i));
                try {
                    Thread.sleep(2000); // Sleep for 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
