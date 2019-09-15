package com.patterns.facade.bank;

public class Main {

    public static void main(String[] args) {

        ClientApi clientApi = new ClientApi();

        clientApi.Account();
        clientApi.MonaySpend();
        clientApi.MonayTransfer();

    }
}

class ClientApi{

    // klasy zawierajce rozne metody jako pola ClientApi
    private BallanceAccount ballanceAccount;
    private MoneySpend moneySpend;
    private MoneyTrasfer moneyTrasfer;

    // metoda ktory stawia obiektgy tych klas

//    public void clientAPI()
//    {
//        ballanceAccount = new BallanceAccount();
//        moneyTrasfer = new MoneyTrasfer();
//        moneySpend = new MoneySpend();
//    }


    //metody ktore wolaja metody tych klas

    public void Account(){
        ballanceAccount.displayAccoutnBallance();
    }
    public void MonaySpend(){
        moneySpend.monaySpend();
    }

    public void MonayTransfer(){
        moneyTrasfer.monayTransfer();
    }
}

// klasy zawierające poszczegolne metody, do ktorych bez fasady
// tzrebabylo sie pojedynczo dobijać

class BallanceAccount{
    public void displayAccoutnBallance(){
        System.out.println("Account balance is");
    }

}

class MoneySpend{
    public void monaySpend(){
        System.out.println("Account monay spend");
    }

}

class MoneyTrasfer{

    public void monayTransfer(){
        System.out.println("Account monay transfer");
    }
}
