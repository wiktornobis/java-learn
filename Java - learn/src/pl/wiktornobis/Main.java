package pl.wiktornobis;

public class Main {

    public static void main(String[] args) {
        User wiktor = new User(10, "Wiktor");
        if(wiktor.canBuyAlkohol()) {
            System.out.println("Can buy");
        } else {
            System.out.println("Can not buy");
        }

    }
}
