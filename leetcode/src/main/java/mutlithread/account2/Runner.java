package mutlithread.account2;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {
    Account a = new Account();
    Account b = new Account();
    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();

    public void acquireLocks(Lock lock1, Lock lock2) throws InterruptedException {
        while (true) {
            boolean getFirstLock = false;
            boolean getSecondLock = false;
            try {
                getFirstLock = lock1.tryLock();
                getSecondLock = lock2.tryLock();
            } finally {
                if (getFirstLock && getSecondLock) return;
                else if (getFirstLock) lock1.unlock();
                else if (getSecondLock) lock2.unlock();
            }
            Thread.sleep(1);
        }
    }

    public void firstThread() throws InterruptedException {
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            acquireLocks(lock1, lock2);
            try {
                Account.transfer(a, b, random.nextInt(100));
            } finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }

    public void secondThread() throws InterruptedException {
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            acquireLocks(lock1, lock2);
            try {
                Account.transfer(b, a, random.nextInt(100));
            } finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }

    public void finished() {
        System.out.println("Account 1 balance " + a.getBalance());
        System.out.println("Account 2 balance " + b.getBalance());
        System.out.println("Total balance" + (a.getBalance() + b.getBalance()));
    }
}
