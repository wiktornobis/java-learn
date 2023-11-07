public class Garnek {
    int srednica;
    int wysokosc;
    String kolor;



    public Garnek(int srednica, int wysokosc, String kolor) {
        this.srednica = srednica;
        this.wysokosc = wysokosc;
        this.kolor = kolor;
    }

    //metoda - o nazwie gotuj

    public String gotuj() {
        return "Gotowanie w trakcie";
    }

    public String gotuj(boolean czyDodalismySol) {
        if (czyDodalismySol) {
            return "Gotowanie z solą";
        } else {
            return "Gotowanie bez soli";
        }
    }

    public int zwrocTemperatureWody () {
        return 100;
    }

    public void gotujBezInformacji () {
        wlaczGarnek();
        gotujPrzezPolGodzinny();
        wylaczGarnek();
    }

    private void wlaczGarnek() {
        System.out.println("Właczanie garnka");
    }

    private void gotujPrzezPolGodzinny() {
        System.out.println("Gotowanie przez 30 minut");
    }
    private void wylaczGarnek() {
        System.out.println("Wylaczanie garnka");
    }
}
