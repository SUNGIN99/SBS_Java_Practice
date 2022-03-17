import java.util.ArrayList;

public class arrayListPractice {


    public static void main(String[] args) {

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("아이유1");
        nameList.add("아이유2");
        nameList.add("아이유3");
        nameList.add("아이유4");
        nameList.add("아이유5");
        nameList.add("아이유6");
        nameList.add("아이유7");


        System.out.println(nameList.size());
        System.out.println(nameList);

        nameList.remove(6);
        nameList.remove(0);
        System.out.println(nameList.size());
        System.out.println(nameList);

    }

}
