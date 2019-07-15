package mutlithread.account2;

public class App {
    public static void main(String[] args) throws InterruptedException {
        final Runner runner = new Runner();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    runner.firstThread();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {
                    runner.secondThread();
                } catch (InterruptedException ignored) {

                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        runner.finished();
    }
}
