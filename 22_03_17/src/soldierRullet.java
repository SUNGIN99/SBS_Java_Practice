import java.util.ArrayList;

public class soldierRullet {
    // 1X 2X 3X 4X 5X 6X 7X 8X

    int surviveLocation2(int n, int k){
        ArrayList<Integer> soldier = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            soldier.add(i);
        }

        int die = 0;
        System.out.println("초기 생존자 : " + soldier + "\n");

        while(soldier.size() > 1){
            die = (die + k - 1) % soldier.size() ;
            System.out.println("index : " + die + ", size : " + soldier.size());
            System.out.println("죽을 사람 : " + soldier.get(die));
            soldier.remove(die);
            System.out.println("생존자 : " + soldier + "\n");

        }
        return soldier.get(0);
    }

    public static void main(String[] args) {
        soldierRullet LetsDie = new soldierRullet();

        int a = LetsDie.surviveLocation2(20,5);
        System.out.println(a);

    }
}

/*
{

        while(n>=2){
        for(int i = 1; i<= k-1; i++){
        soldiers.add(soldiers.get(0));
        soldiers.remove(0);
        }
        corpse_list.add(soldiers.get(0));
        soldiers.remove(0);
        n--;

        }

        for(Integer corpse : corpse_list){
        sout(corpse + "번 군사가 죽습니다.");
        }

        return soldiers.get(0);
}
*/

