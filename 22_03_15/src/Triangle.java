public class Triangle {

    public static void printRectangle(int height){
        String star = "";

        for(int i = 1; i <= height ; i++){
            star += "* ";
            System.out.println(star);
        }

    }

    public static void main(String[] args) {

        printRectangle(5);
        printRectangle(6);

    }

}
