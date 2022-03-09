public class BankDriver {

    public static void main(String[] args) {

        // 1) 예금주 1번 생성
        Person p1 = new Person();

        p1.setName("IU");
        p1.setAge(28);
        p1.setcashAmount(30000);

        BankAccount a1 = new BankAccount();
        a1.setBalance(100000);

        //연관된 객체끼리 엮어줄것!
        p1.setAccount(a1);
        a1.setOwner(p1);

        // 2) 예금주 2번 생성
        // BankDriver 클래스의 main메소드에 수강생 이름과 나이로 새로운 Person 인스턴스를 만들어 p2라는 변수에 저장
        // 그리고 p2에 해당하는 BankAccount 인스턴스 a2를 만들고 두 인스턴스를 연결
        // 계정은 a2, a2의 소유인은 p2
        // 초기 p2의 현금보유량은 100,000원이고, a2의 잔액은 500,000원

        Person p2 = new Person();
        p2.setName("KIM");
        p2.setAge(24);
        p2.setcashAmount(100000);

        BankAccount a2 = new BankAccount();
        a2.setBalance(500000);

        p2.setAccount(a2);
        a2.setOwner(p2);

        // 3)입출금 실행
        System.out.println("p2 초기잔고 : " + p2.getAccountClass().getBalance() + "원, 초기현금 : " + p2.getcashAmount() + "원");;


        // p2에
        // 30000원 입금
        p2.getAccountClass().deposit(30000);

        // 170000원 출금
        p2.getAccountClass().withdraw(170000);

        // 620000원 입금
        p2.getAccountClass().deposit(620000);

        // 890000원 출금
        p2.getAccountClass().withdraw(890000);



        // 디버그
        //System.out.println(p2.account.balance);
        //System.out.println(p2.age);
        //System.out.println(p2.cashAmount);

    }

}
