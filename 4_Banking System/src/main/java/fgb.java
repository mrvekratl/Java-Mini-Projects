import java.util.*;

public class fgb implements CentralBank {

    String name;
    String accno;
    String acc_type;
    long balance;

    fgb(String name, String accno, String acc_type, long balance){
        this.name = name; this.accno = accno; this.acc_type = acc_type;  this.balance = balance;
    };

    public long getBalance(){
        return balance;
    }

    public void withdraw(long amount){
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println("Your balance is less than " + amount + "\tTransaction failed...!!" );
        }

    }

    public void deposit(long amount){
        balance = balance + amount;

    }

    public void showAccount(){
        System.out.println("Name of account holder: " + name);
        System.out.println("Account no.: " + accno);
        System.out.println("Account type: " + acc_type);
        System.out.println("Balance: " + balance);

    }

    public boolean search(String ac_no) {
        if (accno.equals(ac_no)) {
            showAccount();
            return (true);
        }
        return (false);
    }

}