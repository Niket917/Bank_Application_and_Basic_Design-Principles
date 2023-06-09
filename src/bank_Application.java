public interface bank_Application {
    String fetchBalance(String password);

   double addMoney(double amount);

    String widthdrawMoney(String password, double amount);

    String changePassword(String newPassword, String oldPassword);

    double calculateRateOfInterset(double year);
}
