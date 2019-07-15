package atm;

import java.util.Scanner;

public class Atm {
    int deposit,withdrawl,currpin=1234,newpin,pin;
    Scanner sc=new Scanner(System.in);
    public void Deposit()
    {
        System.out.println("enter amount");
        deposit=sc.nextInt();
        System.out.println("taile deposit gareko amount:"+deposit);
    }
    public void Withdrawl()
    {
        int balance;
        System.out.println("kati paisa chahiyo enter gar");
        balance=sc.nextInt();
        if(balance<500)
        {
            System.out.println("tero paisa chaheko vanda kam xa ...bank gayera paisa varera aaiza");
        }
        else if (balance>deposit)
        {
            System.out.println("tero paisa chaheko vanda kam xa ...bank gayera paisa varera aaiza");
        }
        else if (balance==0)
        {
            System.out.println("deposit is 0");
        }
        else
        {
            System.out.println("ekxin koor. transaction hudaixa ..ani paisa lagera jaa");
            deposit-=balance;
        }
    }
    public void BalanceInfo()
    {
        System.out.println("tero baki raheko paisa:"+deposit);
    }
    public void PinChange()
    {
        System.out.println("tero pahile ko pin hana:");
        pin=sc.nextInt();
        if(pin==currpin)
        {
            System.out.println("naya pin haan:");
            newpin=sc.nextInt();
            System.out.println("tero pin chage vaisakyo.");
        }
        else
        {
            System.out.println("pin milena. feri try gar.");
        }
    }
    public void Menu()
    {
        System.out.println("1.deposit\n2.withdrawl\n3.balanceinfo\n4.pin change\n5.exit");
        int choice;
        System.out.println("k garne mann xa tehi haan menu ma vako matra:");
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