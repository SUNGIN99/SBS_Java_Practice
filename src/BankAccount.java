public class BankAccount {
    int balance = 0;
    Person owner;

    //매개변수 : 입금할 액수
    //return 성공여부(boolean)
    boolean deposit(int amount){
        //1. 입금 성공 시, 현재잔고(balance)에 파라미터로 받은 금액(amount)를 더함
        //2. 입금 성공 시, 계좌주의 현금액(cashAmount)을 입금액 만큼 줄임
        //3. 입금할 금액이 음수이면 입금 실패 (0원은 입금성공)
        //4. 계좌주의 현금이 금액보다 작을 경우 입금 실패
        //5. 입금 실패 시 => 입금 실패입니다. 잔고 : xx원, 현금 : xx원
        //6. 입금 성공 시 => xx원 입금하였습니다. 잔고 : xx원, 현금 : xx원
        if(amount < 0 || this.owner.cashAmount < amount){
            System.out.println("입금 실패입니다. 잔고 : " + this.balance + "원, 현금 : " + this.owner.cashAmount + "원");
            return false;
        }
        else{
            this.balance += amount;
            this.owner.cashAmount -= amount;
            System.out.println(amount + "원 입금하였습니다. 잔고 : " + this.balance + "원, 현금 : " + this.owner.cashAmount + "원");
            return true;
        }

    }

    //매개변수 : 출금할 액수
    //return 성공여부(boolean)
    boolean withdraw(int amount){
        //1. 출금 성공 시, 현재 잔고에서 파라미터로 받은 금액을 뺌.
        //2. 출금 성공 시, 계좌주의 현금액을 출금액 만큼 늘려준다.
        //3. 출금할 금액이 음수이면 출금 실패 (0원은 출금성공)
        //4. 출금할 금액이 잔고보다 크면 출금 실패
        //5. 출금 실패 시 => 출금 실패입니다. 잔고 : xx원, 현금 : xx원
        //6. 출금 성공 시 => xx원 출금하였습니다. 잔고 : xx원, 현금 : xx원
        if(amount < 0 || this.balance < amount){
            System.out.println("출금 실패입니다. 잔고 : " + this.balance + "원, 현금 : " + this.owner.cashAmount + "원");
            return false;
        }
        else{
            this.balance -= amount;
            this.owner.cashAmount += amount;
            System.out.println(amount + "원 출금하였습니다. 잔고 : " + this.balance + "원 , 현금 : " + this.owner.cashAmount + "원");
            return true;
        }

    }

    //매개변수1 : 받는사람
    //매개변수2 : 이체할금액(정수)
    //return 성공여부(boolean)
    boolean transfer(Person to, int amount){
        return true;
    }


}
