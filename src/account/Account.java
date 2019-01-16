/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author JPHFONG
 */
public class Account {

    private String accountNumber;
    private float accountBalance;
    private String accountHolder;
    private String emailAddress;
    private String phoneNumber;
    private String passPhrase; // to push into public Git
    
    public Account(){
        System.out.println("Called of empty constructor.");
    }
    public Account(String accountNumber, float accountBalance, String accountHolder, String emailAddress, String phoneNumber){
        System.out.println("Called of parameter constructor.");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountHolder = accountHolder;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    
    public void setAccountBalance(float accountBalance){
        this.accountBalance = accountBalance;
    }
    
    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }
    
    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }
    
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    public void setPassphrase(String passPhrase){
        this.passPhrase = passPhrase;
    }
    
    public String getAccountNumber(){
        return accountNumber;
    }
    
    public float getAccountBalance(){
        return accountBalance;
    }
    
    public String getAccountHolder(){
        return accountHolder;
    }
  
    public String getEmailAddress(){
        return emailAddress;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public String getPassPhrase(){
        return passPhrase;
    }
    
    public void addFund(float newBalance){
        this.accountBalance += newBalance;
        System.out.println("Deposit " + newBalance + ". New balance = " + this.accountBalance);
    }
    
    public void withdrawFund(float takenBalance){
        if((this.accountBalance - takenBalance) < 0){
            System.out.println("Balance available is " + this.accountBalance + ".Insufficient fund!");
        }else{
            this.accountBalance -= takenBalance;
            System.out.println("Withdraw of " + takenBalance + ". Remaining balance = " + this.accountBalance);
        }
    }
            
}
