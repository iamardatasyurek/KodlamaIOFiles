package Threading;

public class StopwatchThread implements Runnable {

    private Thread thread;
    private String threadName;

    public StopwatchThread(String threadName) {
        this.threadName = threadName;
        System.out.println("Thread is Created : " + this.threadName);
    }

    @Override
    public void run() {
        System.out.println("Thread Has Ran : " + this.threadName);
        try {
            for (int i = 0; i < 11; i++) {
                System.out.println(this.threadName + " : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread Has Broken : " + this.threadName);
        }
        System.out.println("Thread's duty just has finished " + this.threadName);
    }

    public void start() {
        System.out.println("Thread is creating... " + this.threadName);
        if (this.thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }

}
