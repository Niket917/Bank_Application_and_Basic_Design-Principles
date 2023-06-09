import java.util.UUID;

public class HDFC_Bank implements bank_Application{
    private String name;

    private String accountNo;  //randon and unique -- UUID
    private String password;

    private double balance;

    final double rateOfInterst = 3.0;

    public HDFC_Bank(){

    }

    public HDFC_Bank(String name, String password, double balance) {
        this.name = name;
        this.accountNo = String.valueOf(UUID.randomUUID());
        this.password = password;
        this.balance = balance;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRateOfInterst() {
        return rateOfInterst;
    }

    @Override
    public String fetchBalance(String password) {
        if(this.password.equals(password)){
            return "Your Account Balance is : "+balance;
        }
        return "Incorrect Password";
    }

    @Override
    public double addMoney(double amount) {
         this.balance += amount;
         return balance;
    }

    @Override
    public String widthdrawMoney(String password, double amount) {
        if(this.password.equals(password)) {
            if (amount > this.balance) {
                return "Insufficent Balance in your Account";
            } else {
                this.balance -= amount;
                return "You have a Succesfull widthdraw money amout is : " + amount + " Your account balance is " + balance;
            }
        }
        return "Incorrect Password";
    }

    @Override
    public String changePassword(String newPassword, String oldPassword) {
        if(this.password.equals(oldPassword)){
            this.password = newPassword;
            return "Congrates! You have Succesfull Change password";
        }
        return "Incorrect Password";
    }

    @Override
    public double calculateRateOfInterset(double year) {
        return (this.balance*rateOfInterst*year)/100;
    }
}
