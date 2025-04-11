public class Window {
    private String naslov;
    private static String oznaka = "Oznaka";
    private static String boja = "Crna";
    private static int[] XKoordinate = {0, 80, 80, 0};
    private static int[] YKoordinate = {0, 0, 25, 25};
    private static boolean aktivan = true;

    //sve osim naslova je static jer konstruktor samo prima naslov,
    // pa ce sve instance klase window imati predefinirane
    // varijable za oznaku, boju, koordinate X i Y i aktivnost prozora

    public Window(String naslov) {
        this.naslov = naslov;
    }

    public String detaljiProzora() {
        return "Naslov: " + naslov +
                ", Oznaka: " + oznaka +
                ", prozor aktivan: " + aktivan +
                ", Koordinate: (" + XKoordinate[0] + ", " + YKoordinate[0] + "), "
                + "(" + XKoordinate[1] + ", " + YKoordinate[1] + "), "
                + "(" + XKoordinate[2] + ", " + YKoordinate[2] + "), "
                + "(" + XKoordinate[3] + ", " + YKoordinate[3] + ")";
    }

    public int width() {
        return Math.abs(XKoordinate[1] - XKoordinate[0]); // udaljenost između prve dvije X koordinate.
                                                        // Koristimo Math.abs jer koordinate ne smiju biti negativne u kodu
    }

    public int height() {
        return Math.abs(YKoordinate[2] - YKoordinate[1]); // udaljenost između druge i treće Y koordinate
    }

    public int area(){
        return width() * height();
    }

    public int perimiter(){
        return 2 * (width() + height());
    }

    public void draw() {
        //pomak na Y ako nam Y ne krece od nule - nije bitno ako su nam koordinate static i uvijek pocinju od nule
        for (int i = 0; i < YKoordinate[0]; i++) {
            System.out.println(" ");
        }
        //opet pomak, ali na X ako nam X ne krece od nule
        for (int i = 0; i < XKoordinate[0]; i++) {
            System.out.print(" ");
        }

        // Gornji rub
        for (int i = 0; i < width(); i++) {
            System.out.print("*");
        }
        System.out.println();

        // Sredina
        for (int i = 0; i < height() - 2; i++) {
            //pomak na X ako nam X ne krece od nule
            for (int j = 0; j < XKoordinate[0]; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 0; k < width() - 2; k++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        //jos jedan pomak na X, ako nam X ne krece od nule
        for (int i = 0; i < XKoordinate[0]; i++) {
            System.out.print(" ");
        }
        // Donji rub
        for (int i = 0; i < width(); i++) {
            System.out.print("*");
        }
    }

}
