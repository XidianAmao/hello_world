package mutlithread.PrintOfOrder;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ABC {
    private static int state = 0;
    private static Lock lock = new ReentrantLock();

    static class A extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10; ) {
                lock.lock();
                if (state % 3 == 0) {
                    System.out.println("A");
                    state++;
                    i++;
                }
                lock.unlock();
            }
        }
    }

    static class B extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10; ) {
                lock.lock();
                if (state % 3 == 1) {
                    System.out.println("B");
                    state++;
                    i++;
                }
                lock.unlock();
            }
        }
    }

    static class C extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10; ) {
                lock.lock();
                if (state % 3 == 2) {
                    System.out.println("C");
                    state++;
                    i++;
                }
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        new A().start();
        new B().start();
        new C().start();
    }
}
