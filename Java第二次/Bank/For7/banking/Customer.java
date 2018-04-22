package For7.banking;

public class Customer {
    private String firstName,lastName;
    private  Account[] accounts;
    private Account savingAccount,checkingAccount;
    private int numberOfAccounts;
    public Customer(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        accounts = new Account[5];
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void addAccount(Account account) {
        this.accounts[numberOfAccounts++] = account;
    }

    public Account getAccount(int index) {
        return accounts[index];
    }

    public int getNumOfAccounts() {
        return numberOfAccounts;
    }
    public Account getSavings(){
        return savingAccount;
    }
    public void setSavings(Account savingAccount){
        this.savingAccount = savingAccount;

    }

    public Account getChecking() {
        return checkingAccount;
    }

    public void setChecking(Account checkingAccount) {
        this.checkingAccount = checkingAccount;
    }
}
