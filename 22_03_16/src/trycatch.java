import java.util.Scanner;

public class trycatch {

    public static void main(String[] args) {
        int smallArr[] = new int[3];

        for(int i = 0 ; i<10; i++){
            try{
                smallArr[i] = i;

            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(i + "번재 예외발생");;
            }
        }

        for(int a : smallArr){
            System.out.println(a);
        }

    }

}
