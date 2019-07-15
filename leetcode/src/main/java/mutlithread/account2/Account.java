package mutlithread.account2;

public class Account {
    private int balance = 1000;
    public void deposit(int money){
        balance += money;
    }

    public void out(int money){
        balance -= money;
    }

    public int getBalance() {
        return balance;
    }

    public static void transfer(Account a,Account b, int money){
        a.out(money);
        b.deposit(money);
    }
}
