//package Constructor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int input = 0;
        float balance = 0;
        //Account account = new Account();
        Scanner sc = new Scanner(System.in);
//        do{
//            System.out.println("1. Deposit fund.\n");
//            System.out.println("2. Withdraw fund.\n");
//            System.out.println("9. Quit.\n");
//            System.out.println("Input: ");
//            input=sc.nextInt();
//            System.out.flush();
//            switch(input){
//                case 1:
//                    System.out.println("Deposit balance: ");
//                    balance = sc.nextFloat();
//                    account.addFund(balance);
//                    System.out.println("Your new balance is " + account.getAccountBalance() + ".");
//                    break;
//                case 2:
//                    System.out.println("Balance withdraw: ");
//                    balance = sc.nextFloat();
//                    account.withdrawFund(balance);
//                    //System.out.println("Your new balance is " + account.getAccountBalance() + ".");
//                    break;
//                default:
//                    break;
//            }
//        }while(input!=9);
//        Account myAccount = new Account("ONG123", 200, "ONGHF", "ONGHF@gmail.com","+6016-4324870");
//        System.out.println("Account Holder  : " + myAccount.getAccountHolder());
//        System.out.println("Account Balance : " + myAccount.getAccountBalance());
//        myAccount.addFund(100);
//        myAccount.withdrawFund(150);
//        myAccount.addFund(200);
//        myAccount.withdrawFund(150);

// 2nd assignment
        VipCustomer vc1 = new VipCustomer();
        System.out.println("Vip customer name  : " + vc1.getName() +
                           "\nVip customer email : " + vc1.getEmail() +
                           "\nVip customer limit : " + vc1.getLimit() );
        VipCustomer vc2 = new VipCustomer("Ong HorngFuh", "OngHF@gmail.com");
        System.out.println("Vip customer name  : " + vc2.getName() +
                           "\nVip customer email : " + vc2.getEmail() +
                           "\nVip customer limit : " + vc2.getLimit() );
        VipCustomer vc3 = new VipCustomer("Lily", "lily@hotmail.com", 12000);
        System.out.println("Vip customer name  : " + vc3.getName() +
                           "\nVip customer email : " + vc3.getEmail() +
                           "\nVip customer limit : " + vc3.getLimit() );
        VipCustomer vc4 = new VipCustomer("Liliana", "liliana@hotmail.com", 53000);
        System.out.println("Vip customer name  : " + vc4.getName() +
                           "\nVip customer email : " + vc4.getEmail() +
                           "\nVip customer limit : " + vc4.getLimit() );
        VipCustomer vc5 = new VipCustomer("Morrigan", "morrigan@hotmail.com", 666666666);
        System.out.println("Vip customer name  : " + vc5.getName() +
                           "\nVip customer email : " + vc5.getEmail() +
                           "\nVip customer limit : " + vc5.getLimit() );
        
    }
    
    public static void print2nd(VipCustomer vc){
       
        
    }
}
