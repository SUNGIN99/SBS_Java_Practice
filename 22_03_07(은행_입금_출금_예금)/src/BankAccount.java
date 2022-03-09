public class BankAccount {
    private int balance = 0;
    private Person owner;

    //setter
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    //getter
    public int getBalance() {
        return this.balance;
    }

    public Person getOwner() {
        return this.owner;
    }


    //매개변수 : 입금할 액수
    //return 성공여부(boolean)
    public boolean deposit(int amount) {
        //1. 입금 성공 시, 현재잔고(balance)에 파라미터로 받은 금액(amount)를 더함
        //2. 입금 성공 시, 계좌주의 현금액(cashAmount)을 입금액 만큼 줄임
        //3. 입금할 금액이 음수이면 입금 실패 (0원은 입금성공)
        //4. 계좌주의 현금이 금액보다 작을 경우 입금 실패
        //5. 입금 실패 시 => 입금 실패입니다. 잔고 : xx원, 현금 : xx원
        //6. 입금 성공 시 => xx원 입금하였습니다. 잔고 : xx원, 현금 : xx원
        int tempCashAmount = this.owner.getcashAmount();

        if (amount < 0 || tempCashAmount < amount) {
            System.out.println("본 계좌(" + this.owner.getName() + ")  입금 실패입니다. 잔고 : " + this.balance + "원, 현금 : " + tempCashAmount + "원");
            return false;
        } else {
            this.balance += amount;
            tempCashAmount -= amount;
            this.owner.setcashAmount(tempCashAmount);
            System.out.println("본 계좌(" + this.owner.getName() + ") " + amount + "원 입금하였습니다. 잔고 : " + this.balance + "원, 현금 : " + tempCashAmount + "원");
            return true;
        }

    }

    //매개변수 : 출금할 액수
    //return 성공여부(boolean)
    public boolean withdraw(int amount) {
        //1. 출금 성공 시, 현재 잔고에서 파라미터로 받은 금액을 뺌.
        //2. 출금 성공 시, 계좌주의 현금액을 출금액 만큼 늘려준다.
        //3. 출금할 금액이 음수이면 출금 실패 (0원은 출금성공)
        //4. 출금할 금액이 잔고보다 크면 출금 실패
        //5. 출금 실패 시 => 출금 실패입니다. 잔고 : xx원, 현금 : xx원
        //6. 출금 성공 시 => xx원 출금하였습니다. 잔고 : xx원, 현금 : xx원
        int tempCashAmount = this.owner.getcashAmount();

        if (amount < 0 || this.balance < amount) {
            System.out.println("본 계좌(" + this.owner.getName() + ")  출금 실패입니다. 잔고 : " + this.balance + "원, 현금 : " + tempCashAmount + "원");
            return false;
        } else {
            this.balance -= amount;
            tempCashAmount += amount;
            this.owner.setcashAmount(tempCashAmount);
            System.out.println("본 계좌(" + this.owner.getName() + ") " + amount + "원 출금하였습니다. 잔고 : " + this.balance + "원 , 현금 : " + tempCashAmount + "원");
            return true;
        }

    }

    public boolean depositWithExchangeRate(double amount, double exchangeRate) {
        return deposit((int) (amount * exchangeRate));
    }


    //매개변수1 : 받는사람
    //매개변수2 : 이체할금액(정수)
    //return 성공여부(boolean)
    // 1. 메소드 오버로딩을 이용하여 BankAccount 클래스에 두 개의 tranfer 를 정의
    // 2. Person 클래스에도 transfer를 두 개 정의
    // 3. 송금 방식 계좌 - 계좌 간

    /*
     * 1) 송금 성공시 true리턴 실패시 false
     *
     * 2) 송금하고자 하는 금액(amount)이 음수일 때 송금 실패
     * 3) amount가 잔고(balance)보다 클때 송금 실패
     *
     * 4) true : 나의 balance를 amount만큼 줄이고 받는사람(to)의 balance를 amount만큼 늘려줌
     *
     * 5) 송금 성공 시 아래 문구를 출력
     *    - true -from : [송금자이름], to : [수신자이름]. amount : [송금액], balance : [잔고]
     * 5) 송금 성공 시 아래 문구를 출력
     *   - false -from : [송금자이름], to : [수신자이름]. amount : [송금액], balance : [잔고]
     *
     * */
    public boolean transfer(Person to, int amount) {
        if (amount > balance) {
            System.out.println("-false -from : [" + owner.getName() + "], to : [" + to.getName() + "], amount : [" + amount + "], balance : [" + balance + "]");
            return false;
        } else {
            // 내계좌 변동
            balance -= amount;

            // 상대계좌 변동
            int toS_Balance = to.getAccountClass().getBalance();
            toS_Balance += amount;
            to.getAccountClass().setBalance(toS_Balance);

            //출력부
            System.out.println("-true -from : [" + owner.getName() + "], to : [" + to.getName() + "], amount : [" + amount + "], balance : [" + balance + "]");
            this.owner.getCurrentState();
            to.getCurrentState();
            System.out.println("");

            return true;
        }
    }

    public boolean transfer(BankAccount to, int amount) {
        if (amount > balance) {
            System.out.println("-false -from : [" + owner.getName() + "], to : [" + to.getOwner().getName() + "], amount : [" + amount + "], balance : [" + balance + "]");
            return false;
        } else {
            //내계좌 변동
            balance -= amount;

            // 상대계좌 변동
            int toS_Balance = to.getBalance();
            toS_Balance += amount;
            to.setBalance(toS_Balance);

            //출력부
            System.out.println("-true -from : [" + owner.getName() + "], to : [" + to.getOwner().getName() + "], amount : [" + amount + "], balance : [" + balance + "]");
            this.owner.getCurrentState();
            to.getOwner().getCurrentState();
            System.out.println("");

            return true;
        }

    }
}
