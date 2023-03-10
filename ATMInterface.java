//*******ATM MACHINE INTERFACE*************
import java.util.*;
class ATM{
    float Balance;
    int PIN=2550;
    public void checkpin(){
        System.out.println("******WELCOME USER*******");
        System.out.println("Enter your Pin: ");
        Scanner sc=new Scanner(System.in);
        int enteredpin =sc.nextInt();
        if(enteredpin==PIN){
            menu();
        }
        else{
            System.out.println("Enter a valid pin"); 
        }
    }
    
    public void menu(){
        System.out.println("Enter your Choice:");
        System.out.println("1. Check Account Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");
        
        Scanner sc=new Scanner(System.in);
        int opt=sc.nextInt();
        
        if (opt == 1){
            checkBalance();
        }
        else if(opt==2){
            withdrawMoney();
        }
        else if(opt==3){
            depositMoney();
            menu();
        }
        else if(opt==4){
            return;
        }
        else{
            System.out.println("Enter a valid choice");
        }
    }
    
    public void checkBalance(){
        System.out.println("Balance: "+Balance);
        menu();
    }
    public void withdrawMoney(){
        System.out.println("Enter amount to withdraw: ");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient Balance");
        }
        else{
            Balance=Balance-amount;
            System.out.println("Money withdrawl Successful");
        }
                
        menu();
    }
    public void depositMoney(){
        System.out.println("Enter the amount you want to deposit");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        Balance=Balance+amount;
        System.out.println("Money deposited Successfully");
    }
}
public class atmmachine {
    public static void main(String[] args) {
        ATM atm=new ATM();
        atm.checkpin();
    }
}
