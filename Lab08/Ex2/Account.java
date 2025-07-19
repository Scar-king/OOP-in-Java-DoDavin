package Ex2;

public class Account {
    private int acc_id;
    private String acc_holder;
    private double balance;

    Account(int acc_id, String acc_holder, double balance){
        this.acc_id = acc_id;
        this.acc_holder = acc_holder;
        this.balance = balance;
    }

    public int getId(){
        return acc_id;
    }

    public String getAccHolder(){
        return acc_holder;
    }

    public double getAccBalance(){
        return balance;
    }

    public void setId(int acc_id){
        this.acc_id = acc_id;
    }

    public void setAccHolder(String acc_holder){
        this.acc_holder = acc_holder;
    }

    public void setAccBalance(double balance){
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public boolean withdraw(double amount, double minBalance){
        if(balance - amount >= minBalance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}