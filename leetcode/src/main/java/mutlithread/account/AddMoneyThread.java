package mutlithread.account;

public class AddMoneyThread implements Runnable {
    private Account account;
    private double money;

    public AddMoneyThread(Account account, double money) {
        this.account = account;
        this.money = money;
    }

    public void run() {
        synchronized (this){
            account.deposit(money);
        }
    }
}
