import java.util.UUID;

public class Bank_Of_India implements bank_Application {
    private String name;

    private double mobileNo ;

    private String accountNo;

    private String panCard;

    private double balance;

    private String password;

    final double rateOfInterst = 2.5;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(double mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getPanCard() {
        return panCard;
    }

    public void setPanCard(String panCard) {
        this.panCard = panCard;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateOfInterst() {
        return rateOfInterst;
    }

    public Bank_Of_India(){

    }

    public Bank_Of_India(String name, double mobileNo, String panCard, double balance, String password) {
        this.name = name;
        this.mobileNo = mobileNo;
        this.accountNo = String.valueOf(UUID.randomUUID());
        this.panCard = panCard;
        this.balance = balance;
        this.password = password;
    }

    @Override
    public String fetchBalance(String password) {
        if(this.password.equals(password)){
            return "Your Account Balance is : "+balance;
        }
        return "Incorrect Password Please Retry again";
    }

    @Override
    public double addMoney(double amount) {
        this.balance += amount;
        return balance;
    }

    @Override
    public String widthdrawMoney(String password, double amount) {
        if(this.password.equals(password)){
            if(amount < this.balance){

            } else {
                return  name +" Insufficent Balance in Your account";
            }
        }
        return "Incorrect Password Please Retry again";
    }

    @Override
    public String changePassword(String newPassword, String oldPassword) {
        if(this.password.equals(oldPassword)){
            this.password = newPassword;
            return "Congrates "+ name + " you have Succesful Change your Password";
        }
        return "Incorrect Password Please Retry again";
    }

    @Override
    public double calculateRateOfInterset(double year) {
        return (balance * rateOfInterst * year)/1000;
            }
}
