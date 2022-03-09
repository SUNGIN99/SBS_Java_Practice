public class Person {

    private String name;
    private int age;
    private int cashAmount;
    private BankAccount account;


    // setter
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setcashAmount(int cashAmount){
        this.cashAmount = cashAmount;
    }

    public void setAccount(BankAccount account){
        this.account = account;
    }

    // getter
    public int getcashAmount(){
        return this.cashAmount;
    }

    public BankAccount getAccountClass(){
        return this.account;
    }
}
