public class Main {

    public static void main(String[] args) {
        Garnek garnek = new Garnek(17, 15, "czerwony");

        String wiadomosc = garnek.gotuj();
        System.out.println(wiadomosc);

        String wiadomość2 = garnek.gotuj(false);
        System.out.println(wiadomość2);

        int temperatura = garnek.zwrocTemperatureWody();
        System.out.println(temperatura);

        garnek.gotujBezInformacji();


    }
}
