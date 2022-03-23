public class Seat {
    String name;
    boolean seatValid;

    public Seat(){
        this.seatValid = false;
    }


    boolean isOccupied(){

        return seatValid;
    }

}