package bankaccount;

import java.util.List;

public class Main {
    public static void main(String args[]) {
        Account sbi = new Account("Kalimuthu",7402181662L,100000);
        Account axis = new Account("Geetha",9790295762L,20000);
        Account icici = new Account("Ramachandran",7603985858L,10000);
        AccountBase accountBase = new AccountBase();
        accountBase.addAccount(sbi);
        accountBase.addAccount(axis);
        accountBase.addAccount(icici);

        accountBase.withdrawalAmount(sbi,7402181662L,10000);
        accountBase.withdrawalAmount(sbi,7402181662L,100000);

    }
}
