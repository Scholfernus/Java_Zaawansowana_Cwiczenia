package pl.sdajavapol141.Task04;

public class Task04 {
    public static void main(String[] args) {
    var storage = new Storage();
    storage.addToStorage("Adam", "Nowak");
    storage.addToStorage("Adam", "Kowal");
    storage.addToStorage("Ewa", "Nowak");
    storage.addToStorage("Ala", "Abecka");
    storage.printValues("Adam");
    storage.findValues("Nowak");
    storage.findValues("SJKHJK");

    }
}

