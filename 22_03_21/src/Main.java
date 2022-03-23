public class Main {
    public static void main(String[] args) {
        Theater t = new Theater(5, 9);
        t.printSeatMatrix();

        System.out.println("아이유님 이름으로 A5부터 2개의 좌석 예약: " + (t.reserve("아이유", 'A', 5, 2) ? "성공" : "실패"));
        System.out.println("제니님 이름으로 C1부터 3개의 좌석 예약: " + (t.reserve("제니", 'C', 1, 3) ? "성공" : "실패"));
        System.out.println("손나은님 이름으로 D4부터 7개의 좌석 예약: " + (t.reserve("손나은", 'D', 4, 7) ? "성공" : "실패"));
        System.out.println("문채원님 이름으로 C7부터 3개의 좌석 예약: " + (t.reserve("문채원", 'C', 7, 3) ? "성공" : "실패"));

        t.printSeatMatrix();

        System.out.println("A6부터 좌석 3개 취소: 총 " + t.cancel('A', 6, 3) + "개의 좌석이 취소되었습니다.");
        System.out.println("제니님의 좌석 취소: 총 " + t.cancel("제니") + "개의 좌석이 취소되었습니다.");

        System.out.println();
        t.printSeatMatrix();
        System.out.println("총 " + t.getNumberOfReservedSeat() + "개의 좌석이 예약되었습니다.");
    }
}