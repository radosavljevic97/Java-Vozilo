package Domaci2112.Vozilo;

public class Voznja {
    public static void main(String[] args) {

        Automobil prvi = new Automobil("Audi", "A6", 11200, "Milos Milosevic");
        Automobil drugi = new Automobil("Hyundai", "Tuscon", 243010, "Marko Markovic");

        System.out.println("Marka prvog automobila je: " + prvi.getMarka());
        System.out.println("Model prvog automobila je: " + prvi.getModel());
        System.out.println("Serijski broj prvog automobila je: " + prvi.getSerijskiBroj());
        System.out.println("Vlasnik prvog automobila je: " + prvi.getVlasnik());
        System.out.println();

        System.out.println("Marka drugog automobila je: " + drugi.getMarka());
        System.out.println("Model drugog automobila je: " + drugi.getModel());
        System.out.println("Serijski broj drugog automobila je: " + drugi.getSerijskiBroj());
        System.out.println("Vlasnik drugog automobila je: " + drugi.getVlasnik());





    }
}
