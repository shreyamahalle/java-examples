package src.com.shreya.multithreading.thread;

public class MyThread extends Thread{

    public void run(){
        System.out.println("my thread " + Thread.currentThread().getId() + "with " + Thread.currentThread().getName()+
                " is running");
    }
}
