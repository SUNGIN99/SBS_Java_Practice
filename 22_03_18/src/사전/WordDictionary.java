import java.util.HashMap;
import java.util.Locale;

public class WordDictionary {

    HashMap<String, String> WordList = new HashMap<>();

    public void addWord(String english, String korean){
        WordList.put(english, korean);
    }

    public String find(String english){

        for(String key : WordList.keySet()){
            if(key.toLowerCase().equals(english.toLowerCase()))
                return WordList.get(key);
        }

        return null;
    }


}
