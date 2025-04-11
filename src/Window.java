public class Window {
    private String naslov;
    private String oznaka;
    private String boja;
    private int[] XKoordinate = new int[4];
    private int[] YKoordinate = new int[4];
    private boolean aktivan = true;

    // Konstruktor - samo naslov
    public Window(String naslov) {
        this.naslov = naslov;
    }

    // GETTERI i SETTERI
    public String getNaslov() {
        return naslov;
    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public boolean isAktivan() {
        return aktivan;
    }

    public void setAktivan(boolean aktivan) {
        this.aktivan = aktivan;
    }

    public int[] getXKoordinate() {
        return XKoordinate;
    }

    public void setXKoordinate(int x0, int x1, int x2, int x3) {
        this.XKoordinate[0] = x0;
        this.XKoordinate[1] = x1;
        this.XKoordinate[2] = x2;
        this.XKoordinate[3] = x3;
    }

    public int[] getYKoordinate() {
        return YKoordinate;
    }

    public void setYKoordinate(int y0, int y1, int y2, int y3) {
        this.YKoordinate[0] = y0;
        this.YKoordinate[1] = y1;
        this.YKoordinate[2] = y2;
        this.YKoordinate[3] = y3;
    }

    public String detaljiProzora() {
        return "Naslov: " + naslov +
                ", Oznaka: " + oznaka +
                ", Boja: " + boja +
                ", Prozor aktivan: " + aktivan +
                ", Koordinate: (" + XKoordinate[0] + ", " + YKoordinate[0] + "), "
                + "(" + XKoordinate[1] + ", " + YKoordinate[1] + "), "
                + "(" + XKoordinate[2] + ", " + YKoordinate[2] + "), "
                + "(" + XKoordinate[3] + ", " + YKoordinate[3] + ")";
    }

    public int width() {
        return Math.abs(XKoordinate[1] - XKoordinate[0]);
    }

    public int height() {
        return Math.abs(YKoordinate[2] - YKoordinate[1]);
    }

    public int area() {
        return width() * height();
    }

    public int perimiter() {
        return 2 * (width() + height());
    }

    public void draw() {
        // Pomak na Y
        for (int i = 0; i < YKoordinate[0]; i++) {
            System.out.println();
        }

        // Gornji rub
        for (int i = 0; i < XKoordinate[0]; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < width(); i++) {
            System.out.print("*");
        }
        System.out.println();

        // Sredina
        for (int i = 0; i < height() - 2; i++) {
            for (int j = 0; j < XKoordinate[0]; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 0; k < width() - 2; k++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        // Donji rub
        for (int i = 0; i < XKoordinate[0]; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < width(); i++) {
            System.out.print("*");
        }
    }
}
