package oop_giris;

public class Main {
    public static void main(String[] args) {
        Televizyon tv= new Televizyon();
        tv.ac();
        tv.setSesSeviyesi(20);
        tv.setKanal(5);
        tv.setAcik(true);
        tv.kapat();
        tv.goster();
    }
}
