import java.util.*;

public class BankDriver {

    public static CentralBank createAccount(ArrayList<CentralBank> C){
        int choice;
        String name, accNo, acc_type;
        long balance;
        boolean found;

        CentralBank cus1;

        System.out.println("Enter ur Bank");
        System.out.println("1.UNB 2.SGB 3. FGB");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();

        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Account No: ");
        accNo = sc.next();
        System.out.print("Enter Account type: ");
        acc_type = sc.next();
        System.out.print("Enter Balance: ");
        balance = sc.nextLong();

        found = false;
        for (int i = 0; i < C.size(); i++) {
            found = C.get(i).search(accNo);
            if (found) {
                System.out.println("Account with entered accNo already exists.");
                break;
            }
        }
        if (!found) {
            switch(choice){
                case 1:if(balance < 1000)
                {
                    System.out.println("Minimum balance is 1000. Please make sure your minimum balance is 1000");
                }
                else{
                    cus1 = new unb(name, accNo, acc_type, balance);
                    System.out.println("Account created");
                    return cus1;
                }
                    break;
                case 2:if(balance < 2000)
                {
                    System.out.println("Minimum balance is 2000. Please make sure your minimum balance is 20000");
                }
                else{
                    cus1 = new nbd(name, accNo, acc_type, balance);
                    System.out.println("Account created in nbd");
                    return cus1;
                }
                    break;

                case 3:if(balance < 3000)
                {
                    System.out.println("Minimum balance is 3000. Please make sure your minimum balance is 5000");
                }
                else{
                    cus1 = new fgb(name, accNo, acc_type, balance);
                    System.out.println("Account created");
                    return cus1;
                }
                    break;

                default: System.out.println("Wrong Choice");

            }
        }


        return null;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        ArrayList<CentralBank> C = new ArrayList<>();
        System.out.println("No accounts found. Please Create one");
        CentralBank cus1 = createAccount(C);
        if(cus1 != null) {
            C.add(cus1);
        }

        int ch;
        do {
            System.out.println("\n #Banking System Application#");
            System.out.println(" 1.Create an account \n2. Display all account details \n 3. Search by Account number\n 4. Deposit the amount \n 5. Withdraw the amount \n 6. Remove account\n 7.Exit ");
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1: CentralBank cus = createAccount(C);
                    if(cus != null) {
                        C.add(cus);
                    }
                    break;
                case 2:
                    if(C.isEmpty()){
                        System.out.println("No accounts found");
                    }
                    for (int i = 0; i < C.size(); i++) {
                        C.get(i).showAccount();
                    }
                    break;
                case 3:
                    System.out.print("Enter account no. you want to search: ");
                    String ac_no = sc.next();
                    boolean found = false;
                    for (int i = 0; i < C.size(); i++) {
                        found = C.get(i).search(ac_no);
                        if (found) {
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist..!!");
                    }
                    break;
                case 4:
                    System.out.print("Enter Account no. : ");
                    ac_no = sc.next();
                    found = false;
                    for (int i = 0; i < C.size(); i++) {
                        found = C.get(i).search(ac_no);
                        if (found) {
                            System.out.println("Enter the amount to deposit");
                            long amount = sc.nextLong();
                            C.get(i).deposit(amount);
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist..!!");
                    }
                    break;
                case 5:
                    System.out.print("Enter Account No : ");
                    ac_no = sc.next();
                    found = false;
                    for (int i = 0; i < C.size(); i++) {
                        found = C.get(i).search(ac_no);
                        if (found) {
                            System.out.println("Enter the amount to withdraw");
                            long amount = sc.nextLong();
                            C.get(i).withdraw(amount);
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist.!");
                    }
                    break;
                case 6:
                    System.out.println("Enter your acc no: ");
                    String temp = sc.next();
                    found = false;
                    for (int i = 0; i < C.size(); i++) {
                        found = C.get(i).search(temp);
                        if (found) {
                            C.remove(i);
                            System.out.println("Account deleted successfully");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist.!");
                    }
                    break;
                case 7: break;
                default: System.out.println("Enter the correct Choice");
                    break;
            }
        }
        while (ch != 7);
    }

}