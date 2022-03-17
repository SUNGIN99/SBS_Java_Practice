import java.lang.reflect.Array;
import java.util.ArrayList;

public class mainInt {

    public static void main(String[] args) {

        ArrayList<Integer> numList = new ArrayList<>();

        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);
        numList.add(5);

        for(int num:numList){
            System.out.println(num*num);
        }

        System.out.println((numList.get(0)).getClass().getName());

    }



}
