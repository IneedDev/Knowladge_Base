package com.patterns.facade.bank;

public class Main {

    public static void main(String[] args) {

        ClientAPI clientAPI = new ClientAPI();
        clientAPI.Account();
        clientAPI.MonayTransfer();
        clientAPI.MoneySpend();

    }
}
class ClientAPI{

    private BalanceAccount balanceAccount;
    private MoneySpend moneySpend;
    private MoneyTransfer moneyTransfer;

    private static Container container;

    public ClientAPI(){

        balanceAccount = new BalanceAccount();
        moneySpend = new MoneySpend();
        moneyTransfer = new MoneyTransfer();
    }

    public void Account(){
        balanceAccount.DisplayStateAccount();
    }

    public void MoneySpend(){
        moneySpend.MonaySpendInLastonth();
    }

    public void MonayTransfer(){
        moneyTransfer.MakeMonayTransfer();
    }
}

class BalanceAccount{

    public void DisplayStateAccount(){

        System.out.println("View account status");
    }
}
class MoneySpend{

    public void MonaySpendInLastonth(){
        System.out.println("You have spent 100 last month");
    }

}

class MoneyTransfer{

    public void MakeMonayTransfer(){

        System.out.println("Make a transfer");
    }

}

class Container{

}
