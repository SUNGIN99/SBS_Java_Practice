public class Triangle {

    public static void printRectangle(int height){
        String star = "";

        for(int i = 1; i <= height ; i++){
            star += "* ";
            System.out.println(star);
        }

    }

    public static void printPyramid(int height){
        String blank = "";
        String star = "*";

        for(int i = 0; i < height; i++){
            blank += " ";
        }

        for(int i = 1; i <= height ; i++){

            if(blank.length() > 1){
                blank = blank.substring(1);
                System.out.println(blank + star);
            }
            else{
                System.out.println(star);
            }
            star += "**";

        }

    }

    public static void main(String[] args) {

        //printRectangle(5);
        //printRectangle(6);

        printPyramid(5);


    }

}
