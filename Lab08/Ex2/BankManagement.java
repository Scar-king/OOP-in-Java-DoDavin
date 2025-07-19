package Ex2;

import java.util.ArrayList;

public class BankManagement {
    private ArrayList<Account> accounts = new ArrayList<>();

    public void createAccount(int id, String name, double balance){
        for(Account account : accounts){
            if(account.getId() == id){
                System.out.println(Color.RED + "\nID can't be duplicate!" + Color.RESET);
                return;
            }
        }
        accounts.add(new Account(id, name, balance));
        System.out.println(Color.GREEN + "\nAccount created successfully!\n" + Color.RESET);
    }

    public void showAccounts(){
        int no = 1;
        boolean hasAccount = false;
        for(Account account : accounts){
            if(account != null){
                hasAccount = true;
                System.out.println(Color.ORANGE + "\nNo #" + (no++));
                System.out.println("ACC_ID: " + account.getId());
                System.out.println("ACC_HOLDER: " + account.getAccHolder());
                System.out.printf("ACC_BALANCE: %.2f$\n\n" + Color.RESET, account.getAccBalance());
            }
        }

        if(!hasAccount){
            System.out.println(Color.RED + "\nNo accounts have been created!\n" + Color.RESET);
        }
    }

    public Account findAccount(int id){
        for(Account account : accounts){
            if(account.getId() == id){
                return account;
            }
        }
        return null;
    }

    public void deposit(int id, double amount) {
        Account account = findAccount(id);
        if(account != null){
            account.deposit(amount);
            System.out.println(Color.GREEN + "\nDeposited successfully!\n" + Color.RESET);
        } else {
            System.out.println(Color.RED + "\nAccount not found.\n" + Color.RESET);
        }
    }

    public void withdraw(int id, double amount){
        Account account = findAccount(id);
        if(account != null){
            if(account.withdraw(amount, 0)) {
                System.out.println(Color.GREEN + "\nWithdrawal successfully!\n" + Color.RESET);
            } else {
                System.out.println(Color.RED + "\nNot enough balance!\n" + Color.RESET);
            } 
        } else {
            System.out.println(Color.RED + "\nAccount not found.\n" + Color.RESET);
        }
    }

    public void transfer(int fromId, int toId, double amount){
        Account from = findAccount(fromId);
        Account to = findAccount(toId);
        if(from == null || to == null){
            System.out.println(Color.RED + "\nOne of the accounts not found!\n" + Color.RESET);
            return;
        }
        if(from.withdraw(amount, 0)) {
            to.deposit(amount);
            System.out.println(Color.GREEN + "\nTransfer successfully!\n" + Color.RESET);
        } else {
            System.out.println(Color.RED + "\nTransfer failed: not enough balance.\n" + Color.RESET);
        }
    }

    public boolean isValidDecimal(double value){
        return Math.round(value * 100.0) == value * 100.0;
    }
}