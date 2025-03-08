package src.com.shreya.multithreading.thread;

public class MyThreadImplementation {
    public static void main(String[] args) {
        System.out.println("my thread is created by extending thread class ");
        int noOdThread = 5;
        for (int i=0; i<noOdThread; i++){
            MyThread myThread = new MyThread();
            myThread.start();
            //myThread.run();
        }
    }
}
