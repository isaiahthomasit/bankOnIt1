import java.util.Scanner;


public class CheckingAccount implements HasMenu{
  private double balance;

  private static Scanner input = new Scanner(System.in);

  public CheckingAccount(){
    balance = 0.0;
  
  }
  
  public CheckingAccount(double balance){
    this.balance = balance; 
  
  }
  
  // Testing
  public static void mainn(String[] args){
    CheckingAccount account = new CheckingAccount();
    account.start();
    
    
  }
  
  public String menu(){
    System.out.println("\nAccount menu");


  }




}

