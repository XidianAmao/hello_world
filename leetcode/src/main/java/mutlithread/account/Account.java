package mutlithread.account;

public class Account {
    private double balance;

    /**
     * 存款
     */
    public synchronized void deposit(double money){
        double newBalance =  balance + money;
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){

        }
        balance = newBalance;
    }

    public double getBalance() {
        return balance;
    }
}
