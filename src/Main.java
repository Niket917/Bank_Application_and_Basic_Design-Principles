public class Main {
    public static void main(String[] args) {
//        HDFC_Bank hdfcBank1 = new HDFC_Bank("Niket Sahu","Niket123",100000);
//        System.out.println("Congrates "+hdfcBank1.getName()+" You have Succesfull opening  new Account "+ "Your Account Number is " +
//                hdfcBank1.getAccountNo());
//
//        HDFC_Bank hdfcBank2 = new HDFC_Bank("Himanshu Sahu","Himanshu123",50000);
//        System.out.println("Congrates "+hdfcBank2.getName()+" You have Succesfull opening  new Account "+ "Your Account Number is " +
//                hdfcBank2.getAccountNo());
//
//        System.out.println(hdfcBank1.addMoney(54245));
//
//        System.out.println(hdfcBank1.widthdrawMoney("Niket123", 25000));
//
//        System.out.println(hdfcBank1.widthdrawMoney("1e1412",32343));
//
//        System.out.println(hdfcBank1.calculateRateOfInterset(5)+ hdfcBank1.getBalance());
//

        Bank_Of_India bankOfIndia1 = new Bank_Of_India("Niket Sahu",12345678,"ADCS9876D",50000,"Niket123");
        System.out.println("Name = "+bankOfIndia1.getName()+"\n"+"Account Number = "+bankOfIndia1.getAccountNo()+"\n"
                );


        Bank_Of_India bankOfIndia2 = new Bank_Of_India("Vansh Sahu",74573899,"MNDA1234D",500,"Vansh123");
        System.out.println("Name = "+bankOfIndia2.getName()+"\n"+"Account Number = "+bankOfIndia2.getAccountNo()+"\n"
        );

        System.out.println(bankOfIndia2.widthdrawMoney("Vansh123", 123435));



    }
    }