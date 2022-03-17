public class UnitConverter {
    // 필요한 상수 정의

    static double KILOGRAM_PER_POUND, POUNDS_PER_KILOGRAM, CENTIMETERS_PER_INCH, INCHES_PER_CENTIMETER;

    // 클래스 인스턴스를 만들지 못하게 하려면 생성자를 private으로!
    private UnitConverter(){}

    public static double toPounds(double kilograms) {
        return kilograms / 0.453595237;
    }
    public static double toKilograms(double pounds) {
        return pounds * 0.45359237;
    }
    public static double toCentimeters(double inches) {
        return inches * 2.54;
    }
    public static double toInches(double centimeters) {
        return centimeters / 2.54;
    }
    public static double toFahrenheit(double celsius) {
        return celsius * ((double)9 / 5) + 32;
    }
    public static double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * ((double)5 / 9);
    }

    // 1파운드 = 0.45359237 킬로그램
    // 1인치 = 2.54 센티미터
    // 섭씨 = 화씨 * F = C X ( 9 / 5) + 32
    // 화씨 = 섭씨 * C = (F - 32) * (5 / 9)
}