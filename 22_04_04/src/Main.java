public class Main {


    public static void main(String[] args) {
        child c = new child();

        System.out.println(c.a);
        System.out.println(c.b);


        child c2 = new child(20, 3);
        System.out.println(c2.a);
        System.out.println(c2.b);
    }
}



//https://limkydev.tistory.com/197


/*
 * super 키워드 사용 규칙
 *
 * 부모 클래스의 생성자를 사용하는데 필요한 몇 가지 규칙
 *
 * 1. 자식 클래스의 인스턴스 생성 시 부모 클래스의 생성자(default)는 반드시 불림.
 *
 * 2. 부모 클래스에 기본 생성자가 없는경우, 즉 파라미터가 없는 생성자가 없는경우, 자식 클래스에서 반드시 직접(코드로써서) 부모클래스의 생성자 호출을 시켜줘야함
 *
 * 3. 부모 클래스의 생성자를 호출할 때는 자식 클래스의 생성자 맨 윗줄에 적어줘야함. 마치 부모클래스의 생성자가 불린 다음 자식 클래스의 생성자가 불린다고 생각 할 수 있음
 *
 * */