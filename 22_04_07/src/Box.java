public class Box {

    private Object something;

    public void set (Object object){
        this.something = object;
    }

    public Object get(){
        return something;
    }


}


/*
Box box = new Box();
Phone phone = new Phone();
box.set(phone);

Phone unboxed = box.get(); // object 객체가 phone으로 변환 불가능
// 캐스팅하면 가능하지만,
*/