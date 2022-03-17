public class MarketGood {
    // 코드를 입력하세요.가게에서 판매할 상품을 위한 클래스를 만들어 봅시다.
    //MarketGood 클래스
    private String name; //상품이름
    private int retailPrice; //출시가격
    private int discountRate; //상훔 할인율 (단위 : %)

    //생성자
    //MarketGood 클래스는 두 개의 생성자를 가지고 있습니다.
    //1. public MarketGood(String name, int retailPrice, int discountRate)
    //- 생성자의 파라미터로 받은 값들을 인스턴스 변수에 지정해줍니다.
    //- discountRate가 0%보다 작거나 100%보다 큰 경우, 0으로 지정해줍니다.
    public MarketGood(String name, int retailPrice, int discountRate){
        this.name = name;
        this.retailPrice = retailPrice;

        if(discountRate < 0 || discountRate > 100)
            this.discountRate = 0;
        else
            this.discountRate = discountRate;
    }

    //2. public MarketGood(String name, int retailPrice)
    //- 두 번째 생성자는 discountRate의 기본값으로 0을 넣어 줍니다.
    public MarketGood(String name, int retailPrice){
        this.name = name;
        this.retailPrice = retailPrice;
        this.discountRate = 0;
        //this(name, retailPrice, 0); 한줄로 해결..!
    }

    //Getter / Setter 메소드
    //1. name, retailPrice는 getter 메소드만 만들어 줍니다. 값을 지정해주는 것은 생성자에서 완료 되었기 때문에
    //setter 메소드는 따로 만들 필요가 없습니다.
    public String getName(){
        return this.name;
    }

    public int getRetailPrice() {
        return this.retailPrice;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    //2. discountRate는 바뀔 수 있기 때문에 getter와 setter 메소드를 모두 만들어 줍니다.
    //public int getDiscountedPrice()
    //할인가를 리턴하는 메소드를 만듭니다. 예를 들어 retailPrice가 10000이고 discountRate가 20이면, 8000을
    //리턴하는 것이죠.
    public int getDiscountedPrice(){
        int temp = this.retailPrice * (100 - this.discountRate) / 100;
        return temp;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }
}