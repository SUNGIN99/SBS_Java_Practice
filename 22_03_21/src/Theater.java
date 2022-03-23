public class Theater {
    int rowCount;
    int colCount;
    Seat seats[][];

    public Theater(int rowCount, int colCount){
        //1) 생성자
        this.rowCount = rowCount;
        this.colCount = colCount;
        this.seats = new Seat[rowCount][colCount];

        for(int i = 0; i < rowCount; i++){
            for(int j = 0; j < colCount; j++){
                seats[i][j] = new Seat();
            }
        }
    }

    public void printSeatMatrix() {
        //2) 좌석 예약 확인
        System.out.print("  ");
        for (int i = 1; i <= 9; i++) {
            System.out.print("  " + i);
        }
        System.out.println();

        for (int i = 0; i < rowCount; i++) {
            System.out.print((char) ('A' + i) + ": ");
            for (int j = 0; j < colCount; j++) {
                Seat s = seats[i][j];
                if (s.isOccupied()) {
                    System.out.print("[O]");
                } else {
                    System.out.print("[ ]");
                }
            }
            System.out.println();
        }
    }

    public boolean reserve(String argName, char rowChar, int colInt, int seatCount){
        // 1) 좌석 예약함수
        int rowInt = rowChar - 'A';
        colInt -= 1;
        // 존재하지 않는 행
        if(rowInt < 0 || rowInt > rowCount){
            //System.out.println("1 행 조건 오류");
            return false;
        }


        // 존재하지 않는 열열
       if(colInt < 0 || colInt > colCount){
           //System.out.println("2 열 조건 오류");
           return false;
       }


       // 예약 좌석이 정해진 열의 수를 초과할 경우
       if(colInt + seatCount > colCount){
           //System.out.println("3 열 자리수 초과");
           return false;
       }


       //예약된 자리가 있는지확인
       for(int j = colInt; j < colInt + seatCount; j++){
           if(seats[rowInt][j].seatValid == true){
               //System.out.println("4 이미 예약된 자리");
               return false;
           }
       }

       //예약 가능한 자리라면
        for(int j = colInt; j < colInt + seatCount; j++){
            seats[rowInt][j].seatValid = true;
            seats[rowInt][j].name = argName;
        }

        System.out.println("##예약완료##");
        return true;

    }

    // 2) 취소함수
    public int cancel(String argName){
        // 매개변수로 전달받은 이름과 같은 좌석의 자리를 취소
        Seat s;
        int cancelCount = 0;
        for(int i = 0; i < rowCount; i++){
            for(int j = 0; j < colCount; j++){
                s = seats[i][j];

                if(s.name == argName){ // cancel condition
                    s.name = null;
                    s.seatValid = false;
                    cancelCount++;
                }
            }
        }

        return cancelCount;
    }

    public int cancel(char rowChar, int colInt, int seatCount){
        int rowInt = rowChar - 'A';
        colInt -= 1;
        int cancelCount = 0;
        Seat s;

        if(colInt + seatCount > colCount){
            for(int j = colInt ; j < colCount; j++){
                s = seats[rowInt][j];

                if(s.seatValid == true){ // cancel condition
                    s.name = null;
                    s.seatValid = false;
                    cancelCount++;
                }
            }
        }

        else{
            for(int j = colInt; j < colInt + seatCount; j++){
                s = seats[rowInt][j];

                if(s.seatValid == true){ // cancel condition
                    s.name = null;
                    s.seatValid = false;
                    cancelCount++;
                }
            }
        }

        return cancelCount;
    }

    public int getNumberOfReservedSeat(){

        int reserveCount = 0;

        for(int i = 0; i < rowCount; i++){
            for(int j = 0; j < colCount; j++){
                if(seats[i][j].seatValid == true){
                    reserveCount++;
                }
            }
        }

        return reserveCount;
    }
}