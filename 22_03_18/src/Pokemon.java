public class Pokemon {

    public final String name;
    private int cp;

    public Pokemon(String name, int cp) {
        this.name = name;
        this.cp = cp;
    }

    public String getName() {
        return name;
    }

    public int getCp() {
        return cp;
    }
}
