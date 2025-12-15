public class unb implements CentralBank{
    String name;
    String accNo;
    String acc_type;
    long balance;

    unb(String name, String accNo, String acc_type, long balance){
        this.name=name;
        this.accNo=accNo;
        this.acc_type=acc_type;
        this.balance=balance;
    }

    public long getBalance(){
        return balance;
    }

    public void withdraw(long amount){
        if(balance >= amount){
            balance -= amount;
            System.out.println("Balance after withdrawal: " + balance);
        }else{
            System.out.println("Your balance is less than " + balance + "\tTransaction failed...!!");
        }
    }

    public void deposit(long amount){
        balance += amount;
    }

    public void showAccount(){
        System.out.println("UNB Bank account");
        System.out.println("Name of account holder: " + name);
        System.out.println("Account no.: " + accNo);
        System.out.println("Account type: " + acc_type);
        System.out.println("Balance: " + balance);
    }

    public boolean search(String acc_no){
        if(accNo.equals(acc_no)){
            showAccount();
            return (true);
        }
        return false;
    }
}
