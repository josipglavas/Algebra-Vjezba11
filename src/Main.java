public class Main {

    public static void main(String[] args){

        Window window1 = new Window("window1");
        window1.setXKoordinate(0, 25, 25, 5);
        window1.setYKoordinate(2, 2, 10, 10);
        window1.setOznaka("prvi prozor");
        window1.setBoja("Plava");
        window1.setAktivan(true);

        System.out.println(window1.detaljiProzora());
        System.out.println("Opseg: " + window1.perimiter());
        System.out.println("Povrsina: " + window1.area());

        window1.draw();
    }
}
