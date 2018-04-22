package banking.banking;

public class CheckingAccount extends Account {
    private double overdraftProtection;
    private SavingAccount protectedBy;
    public CheckingAccount(double init_balance) {
        super(init_balance);
    }
    public CheckingAccount(double init_balance,double overdraftProtection){
        super(init_balance);
        this.overdraftProtection = overdraftProtection;
    }
    public CheckingAccount(double init_balane  ,SavingAccount protectedBy){
        super(init_balane);
        this.protectedBy=protectedBy;
    }
    public boolean withdraw(double amt) {
        if (balance >= amt) balance -= amt;
        else {
            if (protectedBy != null && protectedBy.getBalance() >= (amt - balance)) {
                protectedBy.withdraw(amt - balance);
                balance = 0;
            } else {
                return false;
            }

        }

        return true;
    }

}
