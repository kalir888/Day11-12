package bankaccount;

import java.util.ArrayList;
import java.util.List;

public class AccountBase {
    private List<Account> accountList = new ArrayList<>();

    public void addAccount(Account account) {
        accountList.add(account);
    }

    public void removeAccount(Account account) {
        accountList.add(account);
    }

    public boolean accountExistCheck(long number) {
        byte EXIST = 1;
        byte NOT_EXIST = 2;

        byte check = NOT_EXIST;

        for(Account account: accountList) {
            if(number == account.accountNumber) {
                check = EXIST;
                break;
            }
        }
        if(check == NOT_EXIST)
            return false;
        else
            return true;
    }

    public void checkBalnce(Account account, long number) {
        if(accountExistCheck(number)) {
            if(number == account.accountNumber) {
                System.out.println("Welcome " + account.accountHolderName);
                System.out.println("Your Account balance is " + account.accountBalance);
            }
            else
                System.out.println("Invalid account number");
        }
    }

    public void withdrawalAmount(Account account, long number, long amount) {
        if(accountExistCheck(number)) {
            if(amount <= account.accountBalance) {
                System.out.println("Mr. " + account.accountHolderName + " Rs " + amount + " Debited from your account ");
                account.accountBalance -= amount;
                System.out.println("Your Current Account Balance is " + account.accountBalance);
            }
            else
                System.out.println("Insufficient Balance");
        }else
            System.out.println("Account Number doesn't exist");
    }
}
