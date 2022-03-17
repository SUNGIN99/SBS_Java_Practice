public class Main {


    public static void main(String[] args) {

        Person[] people = new Person[5];

        people[0] = new Person("아이유", 28);
        people[2] = new Person("제니", 26);
        people[3] = new Person("손나은", 21);

        for (int i = 0; i < people.length; i++) {
            Person p = people[i];

            if(p == null){
                System.out.println();
            }
            else{
                System.out.println(p.getName());
            }


        }

    }

}



// 기본형 vs 참조형
