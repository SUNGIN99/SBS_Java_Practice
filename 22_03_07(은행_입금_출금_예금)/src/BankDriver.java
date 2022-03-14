public class BankDriver {

    public static void main(String[] args) {

        // 1) 예금주 1번 생성
        Person p1 = new Person("IU", 28, 30000 );
        BankAccount a1 = new BankAccount(100000, p1);

        p1.setAccount(a1);
        a1.setOwner(p1);

        // 2) 예금주 2번 생성
        // BankDriver 클래스의 main메소드에 수강생 이름과 나이로 새로운 Person 인스턴스를 만들어 p2라는 변수에 저장
        // 그리고 p2에 해당하는 BankAccount 인스턴스 a2를 만들고 두 인스턴스를 연결
        // 계정은 a2, a2의 소유인은 p2
        // 초기 p2의 현금보유량은 100,000원이고, a2의 잔액은 500,000원

        Person p2 = new Person("KIM", 24, 100000);
        BankAccount a2 = new BankAccount(500000, p2);
        /*
        // 3)입출금 실행
        System.out.println("\n<입출금 실행>");
        System.out.println("#실행 전");
        p2.getCurrentState();

        // p2에
        // 3-1) 30000원 입금
        //p2.getAccountClass().deposit(30000);
        // 3-2) 170000원 출금
        //p2.getAccountClass().withdraw(170000);
        // 3-3) 620000원 입금
        //p2.getAccountClass().deposit(620000);
        // 3-4) 890000원 출금
        //p2.getAccountClass().withdraw(890000);

        //System.out.println("\n#실행 후");
        //p2.getCurrentState();
*/

        // 4) 송금
        System.out.println("\n<송금실행>");
        System.out.println("#실행 전");
        //p1.getCurrentState();
        //p2.getCurrentState();
        System.out.println("");

        a2.transfer(a1, 200000); // a2 : kim, a1 : iu
        a1.transfer(p2, 150000); // a1 : iu,  p2 : kim
        p2.transfer(a1, 270000); // p2 : kim, a1 : iu
        p1.transfer(p2,130000);  // p1 : iu , p2, kim

        System.out.println("\n#실행 후");;
        p1.getCurrentState();
        p2.getCurrentState();

        // 디버그
        //System.out.println(p2.account.balance);
        //System.out.println(p2.age);
        //System.out.println(p2.cashAmount);


    }

}
