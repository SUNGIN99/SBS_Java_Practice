public class overloading {
    int add(int a, int b){
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;

    }

    double add(double a, double b){
        return a + b;
    }

    public static void main(String[] args) {
        overloading c = new overloading();

        System.out.println(c.add(2,4));
        System.out.println(c.add(2,4, 5));
        System.out.println(c.add(2.34, 5.12));
    }
}
