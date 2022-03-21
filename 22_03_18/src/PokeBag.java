import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class PokeBag {

    HashMap<String, ArrayList> pokeDex = new HashMap<>();

    //@Override
    public void add(Pokemon obj){
        //System.out.println(obj.getName());

        if(pokeDex.get(obj.getName()) == null) {
            // 1) pokeDex 해시맵에 해당 포켓몬이 존재하지 않는다면,
            // 해당 포켓몬의 최초 객체를 리스트에 추가하고
            // 그 리스트를 해시맵에 새로 추가
            ArrayList<Pokemon> newPokemon = new ArrayList<>();
            newPokemon.add(obj);
            pokeDex.put(obj.getName(), newPokemon);
        }

        else{
            // 2) pokeDex에 해당 포켓몬의 리스트가 이미 존재 한다면
            // 해당 포켓몬의 기존 리스트에 포켓몬 객체를 새로 추가
            pokeDex.get(obj.getName()).add(obj);
        }
    }

    public Pokemon getStrongest(String name){
        // 1) 매개변수로 받은 포켓몬 중에서 가장 강한 녀석
        int HighestCp = 0, tempCp;
        // 가장 높은 Cp 보유 포켓몬, Cp탐색용 변수

        Pokemon Strongest = null, tempPokemon;
        // 가장 쎈 포켓몬 객체, 포켓몬 탐색용 변수

        ArrayList<Pokemon> temp = pokeDex.get(name);
        //해시맵에서 해당 이름을 가진 key 포켓몬 리스트를 가져옴

        if(temp == null) return null;
        //만약 해당 포켓몬이 존재하지 않는다면 null을 반환

       for(int i = 0; i < temp.size(); i++){
            tempPokemon = temp.get(i); // 매개변수로 받은 포켓몬 이름의 능력치 리스트에서 한 객체씩 가져옴
            tempCp = tempPokemon.getCp(); // 한 객체씩 cp를 핸들링

            if(tempCp > HighestCp){ //가장 높은 cp를 가진 객체 포켓몬을 저장
                HighestCp = tempCp;
                Strongest = tempPokemon;
            }

        }
        return Strongest;
    }

    public Pokemon getStrongest(){
        // 2) 가지고 있는 포켓몬 중 가장 강한 녀석
        int HighestCp = 0, tempCp;
        Pokemon Strongest = null, tempPokemon;

        for(ArrayList temp : pokeDex.values()){
            // pokeDex => HashMap
            // pokeDex.values() => 포켓몬의 ArrayList
            // 모든 포켓몬의 ArrayList를 포켓몬마다 하나 씩 탐색하여 그 중에서 가장 큰 녀석을 찾을거임

            for(int i = 0; i < temp.size(); i++){
                tempPokemon = (Pokemon)temp.get(i); //HashMap의 key를 통해 ArrayList의 요소들로 접근

                // 가장 강한 녀석 찾는 중..
                tempCp = tempPokemon.getCp();

                if(tempCp > HighestCp){
                    HighestCp = tempCp;
                    Strongest = tempPokemon;
                }
            }

            //System.out.println(temp);
        }

        //System.out.println(pokeDex.size());

        return Strongest; // 가장 강한 녀석 반환
    }

}

// PokeBag 클래스
// private final 자료형 pokemons = new 자료형();

// (1) PokeDex에서는 한 마리의 인스턴스만 담을 수 있었습니다. PokeBag에서 마릴이라는 key 하나에 여러 마리의 마릴
// 인스턴스를 담을 수 있습니다. 이 상황에 적절한 자료형을 생각해서 작성 하시면 됩니다.

// (2) public ArrayList<Pokemon> getPokemons(String name)
//    name 이름을 갖고 있는 포켓몬을 모두 가져오는 메소드 입니다.

// (3) public void add(Pokemon pokemon)
//  (1)에서 구현한 pokemons에 Pokemon을 넣는 메소드 입니다.

// (4) public Pokemon getStrongest(String name)
// name 이름의 포켓몬 중 가장 강한(cp가 가장 큰) 포켓몬을 가져오는 메소드입니다.

// (5) public Pokemon getStrongest()
// 내가 가진 모든 포켓몬 중 가장 강장 포켓몬을 가져오는 메소드입니다. 내부적으로 (4)번 메소드를 호출하도록 구현해보세요.
/*              pokeBag.add(new Pokemon("마그마", 1024));
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

                System.out.println(pokeBag.getStrongest("마릴"));
                System.out.println(pokeBag.getStrongest());
                System.out.println(pokeBag.getStrongest("피카츄"));*/