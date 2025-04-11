public class Main {

    public static void main(String[] args){

        Window window1 = new Window("window1");
        System.out.println(window1.detaljiProzora());
        System.out.println("Opseg: " + window1.perimiter());
        System.out.println("Povrsina: " + window1.area());
        window1.draw();

    }
}
