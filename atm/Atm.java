package atm;

import java.util.Scanner;

public class Atm {
    int deposit,withdrawl,currpin=1234,newpin,pin;
    Scanner sc=new Scanner(System.in);
    public void Deposit()
    {
        System.out.println("Enter amount:");
        deposit=sc.nextInt();
        System.out.println("Enter amount that you want to deposit:"+deposit);
    }
    public void Withdrawl()
    {
        int balance;
        System.out.println("Enter the amount that you want to withdraw:");
        balance=sc.nextInt();
        if(balance<500)
        {
            System.out.println("Your balance is not enough.");
        }
        else if (balance>deposit)
        {
            System.out.println("Your balance is not enough.");
        }
        else if (balance==0)
        {
            System.out.println("deposit = 0");
        }
        else
        {
            System.out.println("Your transaction has been processing.Please wait for cash and receipt.");
            deposit-=balance;
        }
    }
    public void BalanceInfo()
    {
        System.out.println("Total amount:"+deposit);
    }
    public void PinChange()
    {
        System.out.println("Enter your current pin number:");
        pin=sc.nextInt();
        if(pin==currpin)
        {
            System.out.println("Enter your new pin:");
            newpin=sc.nextInt();
            System.out.println("Your pin has been successfully changed.");
        }
        else
        {
            System.out.println("Incorrect pin,please try again.");
        }
    }
    public void Menu()
    {
        System.out.println("1.deposit\n2.withdrawl\n3.balanceinfo\n4.pin change\n5.exit");
        int choice;
        System.out.println("Please enter your choice:");
        choice=sc.nextInt();
        switch(choice) {
            case 1:
                Deposit();
                break;
            case 2:
                Withdrawl();
                break;
            case 3:
                BalanceInfo();
                break;
            case 4:
                PinChange();
                break;
            case 5:
                break;
        }
    }
}
