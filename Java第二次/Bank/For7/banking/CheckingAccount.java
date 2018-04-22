package For7.banking;

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
    public void withdraw(double amt) throws OverdraftException {
        if(balance>=amt) balance-=amt;
        else{
            if(overdraftProtection==-1){
                throw new OverdraftException("“no overdraft protection",amt-balance);
            }
            if(protectedBy!=null&&protectedBy.getBalance() >= (amt-balance)){
                protectedBy.withdraw(amt - balance);
                balance = 0;
            }else{
                throw new OverdraftException("”Insufficient funds for overdraft protection",amt-balance);
            }

        }

    }

}
