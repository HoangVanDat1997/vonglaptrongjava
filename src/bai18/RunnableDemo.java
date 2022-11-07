package bai18;
public class RunnableDemo implements Runnable {
    private Thread t;
    private final String threadName;

    public RunnableDemo(String threadName) {
        this.t = t;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Running" + threadName + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Running" + threadName + " interrupted");
        }
        System.out.println("Thread" + threadName + "exiting.");
    }
    public void start(){
        System.out.println("Starting" + threadName);
        if (t == null){
            t = new Thread((java.lang.Runnable) this, threadName);
            t.start();
        }
    }

    public static void main(String[] args) {
        System.out.println("Main thread running");
        RunnableDemo runnableDemo = new RunnableDemo("Thread-1-HR-Database");
        runnableDemo.start();
        RunnableDemo runnableDemo2 = new RunnableDemo("Thread-2-Send-Email");
        runnableDemo2.start();

        System.out.println("Main thread stopped!!! ");
    }
    }
