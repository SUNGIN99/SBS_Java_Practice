public class DicMain {

    public static void main(String[] args) {
        WordDictionary dictionary = new WordDictionary();

        dictionary.addWord("Movie", "영화");
        dictionary.addWord("cat", "고양이");
        dictionary.addWord("Dog", "개");
        dictionary.addWord("Book", "책");
        dictionary.addWord("soap", "비누");
        dictionary.addWord("Glasses", "안경");

        System.out.println(dictionary.find("Book"));
        System.out.println(dictionary.find("glasses"));


    }

}
