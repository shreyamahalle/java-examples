package src.com.shreya.multithreading.runnable;

import src.com.shreya.multithreading.thread.MyThread;

public class MyRunnableThreadImplementation {
    public static void main(String[] args) {
        System.out.println("my thread is created by implementing runnable interface");
        int noOdThread = 5;
        for (int i=0; i<noOdThread; i++){

            Thread thread = new Thread(new MyRunnableThread());
            thread.start();
            //myThread.run();
        }
    }
}
