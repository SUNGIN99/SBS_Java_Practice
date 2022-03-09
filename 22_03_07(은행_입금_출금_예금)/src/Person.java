public class Person {

    private String name;
    private int age;
    private int cashAmount;
    private BankAccount account;


    // setter -----------------------------------------------------------------------------------------------------------------------------------------------------------
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if(age > 0)
            this.age = age;
    }

    public void setcashAmount(int cashAmount){
        if(cashAmount >= 0)
            this.cashAmount = cashAmount;
    }

    public void setAccount(BankAccount account){
        this.account = account;
    }

    // getter -----------------------------------------------------------------------------------------------------------------------------------------------------------
    public int getCurrentState(){ //현재 사용자의 계좌 잔고 및 현금 출력
        String print ="예금주명[" + this.name + "]  잔고 : " + this.account.getBalance() + "원, 현금 : " + this.getcashAmount() + "원";
        System.out.println(print);
        return this.account.getBalance();
    }

    public int getcashAmount(){
        return this.cashAmount;
    }

    public BankAccount getAccountClass(){
        return this.account;
    }

    public String getName(){
        return this.name;
    }

    // transfer -----------------------------------------------------------------------------------------------------------------------------------------------------------
    public boolean transfer(Person to, int amount) {
        int toS_Balance = to.getAccountClass().getBalance();
        int my_Balance = this.account.getBalance();

        if (amount > my_Balance) {
            System.out.println("-false -from : [" + this.name + "], to : [" + to.getName() + "], amount : [" + amount + "], balance : [" +  my_Balance + "]");
            return false;
        } else {
            //내계좌 변동
            my_Balance -= amount;
            this.account.setBalance(my_Balance);

            //상대계좌 변동
            toS_Balance += amount;
            to.getAccountClass().setBalance(toS_Balance);

            // 출력부
            System.out.println("-true -from : [" + this.name + "], to : [" + to.getName() + "], amount : [" + amount + "], balance : [" + my_Balance + "]");
            this.getCurrentState();
            to.getCurrentState();
            System.out.println("");

            return true;
        }
    }

    public boolean transfer(BankAccount to, int amount) {
        int toS_Balance = to.getBalance();
        int my_Balance = this.account.getBalance();

        if (amount > my_Balance) {
            System.out.println("-false -from : [" + this.name + "], to : [" + to.getOwner().getName() + "], amount : [" + amount + "], balance : [" + my_Balance + "]");
            return false;
        } else {
            //내계좌 변동
            my_Balance -= amount;
            this.account.setBalance(my_Balance);

            //상대계좌 변동
            toS_Balance += amount;
            to.setBalance(toS_Balance);

            // 출력부
            System.out.println("-true -from : [" + this.name + "], to : [" + to.getOwner().getName() + "], amount : [" + amount + "], balance : [" + my_Balance + "]");
            this.getCurrentState();
            to.getOwner().getCurrentState();
            System.out.println("");

            return true;
        }

    }
}
