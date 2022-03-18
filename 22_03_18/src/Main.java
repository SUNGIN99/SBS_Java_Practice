import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    private final static PokeBag pokeBag = new PokeBag();

    public static void main(String[] args) {

        pokeBag.add(new Pokemon("마그마", 1024));
        pokeBag.add(new Pokemon("마그마그", 215));
        pokeBag.add(new Pokemon("마릴", 816));
        pokeBag.add(new Pokemon("마그마그", 136));
        pokeBag.add(new Pokemon("라프라스", 1822));
        pokeBag.add(new Pokemon("마릴", 215));
        pokeBag.add(new Pokemon("마릴", 185));
        pokeBag.add(new Pokemon("마릴", 110));
        pokeBag.add(new Pokemon("니드킹", 1709));
        pokeBag.add(new Pokemon("마릴", 39));
        pokeBag.add(new Pokemon("마자용", 12));

        String findPokemon = "마릴";
        Pokemon temp;
        for(String POKEMON : pokeBag.pokeDex.keySet()){
            System.out.println(POKEMON);

            for(Object obj : pokeBag.pokeDex.get(POKEMON)){
                temp = (Pokemon)obj;
                System.out.print("[" + temp + ", cp : " + temp.getCp() + "]\t");
            }
            System.out.println("\n");
        }


        System.out.println(pokeBag.pokeDex.get("마릴") + "\n");
        System.out.println("가장 쎈 " + findPokemon + " : " + pokeBag.getStrongest(findPokemon));
        System.out.println("능력치 : " + pokeBag.getStrongest(findPokemon).getCp());

        System.out.println("가장 쎈 " + pokeBag.getStrongest().getName() + " : " + pokeBag.getStrongest());
        System.out.println("능력치 : " + pokeBag.getStrongest().getCp());


        //hashmap 의 key는 'hashcode'관리가 된다.
        // 모든 클래스의 인스턴스가 가진 고유한 값
        // 여러 해시코드가 같은 인스턴스 값을 가질 수 있음
        // key.eqauls로 메소드를 구분

        //일반적인 클래스는 인스턴스 생성시에 hashcode 값이 결정됨
        //같은 정보를 가지고 있는 인스턴스가 다른 hashcode를 가질 수 있음
        // String 은 같은 인스턴스라도 내용이 같으면 같은 hashcode를 가짐
        // key로써 적함 (안에 담긴 의미로 접근하기때문)

    }
}
