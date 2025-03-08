package src.com.shreya.multithreading.threadScheduler;

public class DemoThreadPriority {
    public static void main(String[] args) {
        System.out.println("-------------------------Main Thread Started-----------------------");

        SuperThread superThread = new SuperThread();
        SuperCarThread superCarThread = new SuperCarThread();
        SuperCarBikeThread superCarBikeThread = new SuperCarBikeThread();

        Thread currentThread = Thread.currentThread();

        System.out.println("Thread Name " +currentThread.getName());

        superThread.setPriority(Thread.MAX_PRIORITY);
        superCarThread.setPriority(Thread.MIN_PRIORITY);
        superCarBikeThread.setPriority(Thread.NORM_PRIORITY);

        superThread.run();
        superCarThread.run();
        superCarBikeThread.run();
        System.out.println("-------------------------Main Thread Ends here-----------------------");
    }
}

class SuperThread extends Thread {
    public void run() {
        int superCount = 0;
        System.out.println("super thread started");
        while (superCount<= 3){
            System.out.println("Value " + ++superCount + " in thread superThread") ;
        }
    }
}

class SuperCarThread extends Thread {
    public void run() {
        int superCarCount = 0;
        System.out.println("superCar thread started");
        while (superCarCount<= 3){
            System.out.println("Value " + ++superCarCount + " in thread superCarThread") ;
        }
    }
}

class SuperCarBikeThread extends Thread {
    public void run() {
        int superCarBikeCount = 0;
        System.out.println("superCarBikeCount thread started");
        while (superCarBikeCount<= 3){
            System.out.println("Value " + ++superCarBikeCount + " in thread superCarBikeCount") ;
        }
    }
}