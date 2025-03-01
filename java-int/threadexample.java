class GreetingThread extends Thread {
    private String message;
    private int delay;

    public GreetingThread(String message, int delay) {
        this.message = message;
        this.delay = delay;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(message);
            try {
                Thread.sleep(delay * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class threadexample {
    public static void main(String[] args) {
        Thread t1 = new GreetingThread("Good Morning", 1);
        Thread t2 = new GreetingThread("Hello", 2);
        Thread t3 = new GreetingThread("Welcome", 3);

        t1.start();
        t2.start();
        t3.start();
    }
}